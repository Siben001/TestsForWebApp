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
import ru.sbtqa.tag.pagefactoryexample.pages.Google.ResultsPage;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

@PageEntry(title = "Bank")
public class MainPage extends Page {

    @ElementTitle("Список аккаунтов")
    @FindBy(name = "acc_list")
    @RedirectsTo(page = AccList.class)
    public Button accListButton;

    @ElementTitle("Добавление аккаунта")
    @FindBy(name = "add_acc")
    @RedirectsTo(page = AddAccount.class)
    public Button addAccButton;

    @ElementTitle("Удаление аккаунта")
    @FindBy(name = "delete_acc")
    @RedirectsTo(page = DeleteAccount.class)
    public Button deleteAccButton;

    @ElementTitle("Баланс аккаунта")
    @FindBy(name = "get_balance")
    @RedirectsTo(page = GetBalance.class)
    public Button getBalanceButton;

    @ElementTitle("Снятие денег")
    @FindBy(name = "withdraw_money")
    @RedirectsTo(page = WithdrawMoney.class)
    public Button withdrawButton;

    @ElementTitle("Добавление денег")
    @FindBy(name = "add_money")
    @RedirectsTo(page = AddMoney.class)
    public Button addMoneyButton;

    @ElementTitle("Перевод денег")
    @FindBy(name = "transfer_money")
    @RedirectsTo(page = TranferMoney.class)
    public Button transferMoneyButton;

    public MainPage() {
        PageFactory.initElements(new HtmlElementDecorator(
                new HtmlElementLocatorFactory(PageFactory.getDriver())), this);
    }

    @ActionTitle("нажимает кнопку")
    public void startSearching(String buttonName){
        if (buttonName.equals("ListAccount")){
            accListButton.click();
        }
        if (buttonName.equals("AddAccount")){
            addAccButton.click();
        }
        if (buttonName.equals("DeleteAccount")){
            deleteAccButton.click();
        }
        if (buttonName.equals("GetBalance")){
            getBalanceButton.click();
        }
        if (buttonName.equals("WithdrawMoney")){
            withdrawButton.click();
        }
        if (buttonName.equals("AddMoney")){
            addMoneyButton.click();
        }
        if (buttonName.equals("TransferMoney")){
            transferMoneyButton.click();
        }

    }
}
