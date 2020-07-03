package Data;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import utils.ExcelUtil;

public class SigninData extends ExcelUtil {

    private static final Logger LOGGER = Logger.getLogger(SigninData.class);

    public SigninData () {
        super("src\\main\\resources\\Excel\\ExcelSheet.xlsx");
    }
    @DataProvider(name = "SigninPage")
    public Object[][] SigninPage() {

        int rows = getRowCount("Signin");
        int col = getColumnCount("Signin");


        LOGGER.info("row = "+ rows + " columns = "+ col);
        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Signin", i, j);
            }
        }
        return data;
    }
}
