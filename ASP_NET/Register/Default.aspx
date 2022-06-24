<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Default.aspx.cs" Inherits="_Default" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>User Register</title>
    <link rel="stylesheet" href="StyleSheet.css" type="text/css" />
</head>
<body>
    <h1 style="text-align:center; font-family: Arial; font-size: 2.5rem; font-weight: 900;">Welcome to the System</h1>
    <hr style="width: 32rem;" />
    <form id="form1" runat="server">
    <h2 style="text-align:center; font-family: Arial; font-size: 1.5rem; font-weight: 600; text-decoration: underline;">User Registeration</h2>
    <table border="2">
        <tr>
            <td><asp:Label ID="Label1" runat="server" Text="First Name"></asp:Label></td>
            <td><asp:TextBox ID="TextBox1" runat="server" placeholder="Enter your first name"></asp:TextBox></td>
        </tr>
        <tr>
            <td><asp:Label ID="Label2" runat="server" Text="Last Name"></asp:Label></td>
            <td><asp:TextBox ID="TextBox2" runat="server" placeholder="Enter your last name"></asp:TextBox></td>
        </tr>
        <tr>
            <td><asp:Label ID="Label3" runat="server" Text="Email"></asp:Label></td>
            <td><asp:TextBox ID="TextBox3" runat="server" placeholder="Enter your email"></asp:TextBox></td>
        </tr>
        <tr>
            <td><asp:Label ID="Label4" runat="server" Text="Mobile"></asp:Label></td>
            <td><asp:TextBox ID="TextBox4" runat="server" placeholder="Enter your mobile"></asp:TextBox></td>
        </tr>
        <tr>
            <td><asp:Label ID="Label5" runat="server" Text="Password"></asp:Label></td>
            <td><asp:TextBox ID="TextBox5" runat="server" placeholder="Enter a strong password" TextMode="Password" ></asp:TextBox></td>
        </tr>
        <tr>
            <td><asp:Label ID="Label6" runat="server" Text="Confirm Password"></asp:Label></td>
            <td><asp:TextBox ID="TextBox6" runat="server" placeholder="Confirm your password" TextMode="Password"></asp:TextBox></td>
        </tr>
        <tr>
            <td>
                <asp:Button ID="Button1" runat="server" Text="Submit" onclick="Button1_Click" /><!--<input type="button" name="submit" class="button" value="Submit"/>---></td>
            <td><input type="button" name="reset" class="button" value="Reset" /></td>
        </tr>
    </table>
    </form>
</body>
</html>
