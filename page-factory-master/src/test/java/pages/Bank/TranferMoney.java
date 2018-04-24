package pages.Bank;


import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.Page;
import ru.sbtqa.tag.pagefactory.PageFactory;
import ru.sbtqa.tag.pagefactory.annotations.ActionTitle;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TextBlock;
import ru.yandex.qatools.htmlelements.element.TextInput;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

@PageEntry(title = "Перевод денег")
public class TranferMoney extends Page {

    @ElementTitle("Имя аккаунта отправителя")
    @FindBy(name = "account_name_from")
    public TextInput acc_name_from;

    @ElementTitle("Имя аккаунта получателя")
    @FindBy(name = "account_name_to")
    public TextInput acc_name_to;

    @ElementTitle("Сумма")
    @FindBy(name = "sum")
    public TextInput sum_text;

    @ElementTitle("Отправить запрос")
    @FindBy(name = "submit")
    public Button submitButton;

    @ElementTitle("Информация")
    @FindBy(name = "info")
    public TextBlock info;

    public TranferMoney(){
        PageFactory.initElements(new HtmlElementDecorator(
                new HtmlElementLocatorFactory(PageFactory.getDriver())), this);
    }

    @ActionTitle("указывает отправителя")
    public void inputAccNameFrom(String accName){
        acc_name_from.sendKeys(accName);
    }

    @ActionTitle("указывает получателя")
    public void inputAccNameTo(String accName){
        acc_name_to.sendKeys(accName);
    }

    @ActionTitle("отправляет")
    public void inputSumText(String sumText){
        sum_text.sendKeys(sumText);
        submitButton.click();
    }

    @ActionTitle("появляется сообщение")
    public void getInfo(String message){
        String msg_text = info.getText();
        Assert.assertEquals("Incorrect info message", message, msg_text);
    }
}
