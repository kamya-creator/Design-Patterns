package Open_ClosePrinciple;


/*
Suppose this class is tested and live at production , now new requirement comes we have to write
save to FILE logic as well
 */
public class InvoiceDAOOperations {

    public void saveToDB()
    {
        // Save to MySQL DB
    }


    /*
    Added new logic as per new requirement, but now this file become prone to bugs,
    qki jo already live code h aap usmai changes kr rhe ho, It not good practice
     */
    public void saveToFILE()
    {
        // Save to MySQL DB
    }


}
