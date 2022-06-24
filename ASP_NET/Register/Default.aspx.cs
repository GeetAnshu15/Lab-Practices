using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class _Default : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void cus_validfunc(object source, ServerValidateEventArgs args)
    {
        string inputData = args.Value;
        args.IsValid = false;
        if (inputData.Length < 6 || inputData.Length > 12) return;
        bool upperCase = false;
        foreach (char ch in inputData)
        {
            if (ch >= 'A' && ch <= 'Z')
            {
                upperCase = true;
                break;
            }
        }
        if (!upperCase) return;
        bool lowerCase = false;
        foreach (char ch in inputData)
        {
            if (ch >= 'a' && ch <= 'z')
            {
                lowerCase = true; break;
            }
        }
        if (!lowerCase) return;
        bool number = false;
        foreach (char ch in inputData)
        {
            if (ch >= '0' && ch <= '9')
            {
                number = true; break;
            }
        }
        if (!number) return;
        args.IsValid = true;
    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        String fname = TextBox1.Text;
        String lname = TextBox2.Text;
        String email = TextBox3.Text;
        String mobile = TextBox4.Text;
        String pass = TextBox5.Text;
        String cpass = TextBox6.Text;

Response.Redirect(string.Format("~/Default2.aspx?fname={0}&lname={1}&email={2}&mobile={3}", fname, lname, email, mobile));


    }
}