package pages.Bank;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.Page;
import ru.sbtqa.tag.pagefactory.PageFactory;
import ru.sbtqa.tag.pagefactory.annotations.ActionTitle;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;
import ru.sbtqa.tag.pagefactory.annotations.RedirectsTo;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.Link;
import ru.yandex.qatools.htmlelements.element.TextBlock;
import ru.yandex.qatools.htmlelements.element.TextInput;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

import java.util.List;

@PageEntry(title = "Добавление аккаунта")
public class AddAccount extends Page {

    @ElementTitle("Имя аккаунта")
    @FindBy(name = "account_name")
    public TextInput acc_name;

    @ElementTitle("Отправить запрос")
    @FindBy(name = "submit")
    public Button submitButton;

    @ElementTitle("Информация")
    @FindBy(name = "info")
    public TextBlock info;

    @ElementTitle("Отправить запрос")
    @FindBy(name = "back")
    @RedirectsTo(page = MainPage.class)
    public Button backButton;

    public AddAccount(){
        PageFactory.initElements(new HtmlElementDecorator(
                new HtmlElementLocatorFactory(PageFactory.getDriver())), this);
    }

    @ActionTitle("добавляет аккаунт")
    public void inputAccName(String accName){
        acc_name.sendKeys(accName);
        submitButton.click();
    }

    @ActionTitle("появляется сообщение")
    public void getInfo(String message){
        String msg_text = info.getText();
        Assert.assertEquals("Incorrect info message", message, msg_text);
    }

    @ActionTitle("возвращается в меню")
    public void backToMenu(){
        backButton.click();
    }
}
