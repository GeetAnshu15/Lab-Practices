using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Default2 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {


        if (!this.IsPostBack)
        {
            string fname = Request.QueryString["fname"];
            string lname = Request.QueryString["lname"];
            string email = Request.QueryString["email"];
            string mobile = Request.QueryString["mobile"];


            string data = "<u>Values from QueryString</u><br /><br />";
            data += "<b>Name:</b> " + fname + " " + lname + "<br />" + " <b>Email:</b> " + email + "<br />" + " <b>Mobile:</b>" + mobile;
            Label1.Text = data;
        }


    }
}