Public Class Form1

Dim horses As New List(Of String)

Private Sub Form1_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load

horses.Add("Arabian")
horses.Add("Morgan")
horses.Add("Lipizzaner")
horses.Add("American Saddlebred")
horses.Add("Appaloosa")

End Sub

Private Sub btnHope_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnHope.Click

For Each h As String In horses

MsgBox("Let's hope for horses like the " & h & " to continue to thrive!")

Next

End Sub

End Class