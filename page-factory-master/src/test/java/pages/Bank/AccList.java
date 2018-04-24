package pages.Bank;

import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.Page;
import ru.sbtqa.tag.pagefactory.PageFactory;
import ru.sbtqa.tag.pagefactory.annotations.ActionTitle;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;
import ru.yandex.qatools.htmlelements.element.TextBlock;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

@PageEntry(title = "Список аккаунтов")
public class AccList extends Page {

    @ElementTitle("Информация")
    @FindBy(name = "acc_list")
    public TextBlock acc_list;

    @ElementTitle("Информация")
    @FindBy(name = "info")
    public TextBlock info;

    public AccList(){
        PageFactory.initElements(new HtmlElementDecorator(
                new HtmlElementLocatorFactory(PageFactory.getDriver())), this);
    }

    @ActionTitle("проверяет список")
    public void inputAccName(String accList){
        String list_text = acc_list.getText();
        String new_str = accList.replace ("\\n", "\n");
        Assert.assertEquals("Account List incorrect", new_str, list_text);
    }

    @ActionTitle("появляется сообщение")
    public void getInfo(String message){
        String msg_text = info.getText();
        Assert.assertEquals("Incorrect info message", message, msg_text);
    }
}
