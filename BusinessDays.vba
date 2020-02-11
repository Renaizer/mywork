Function TATCounter(rng As Range) As Integer

 

 Dim AcceptedDate As Date

 Dim CurrentDate As Date

 

 

 CurrentDate = Date

 AcceptedDate = CDate(rng)

 

 Dim ActualTAT As Integer

 

 ActualTAT = CurrentDate - AcceptedDate

 

 'MsgBox "Actual TAT  = " & ActualTAT

 

 'Weekday ()

 Dim counter As Integer

 Dim day As Variant

 Dim i As Variant

 

 'MsgBox "Day of the week " & Weekday(AcceptedDate + 1)

 

 counter = 1

 

    For i = 1 To ActualTAT

     day = Weekday(AcceptedDate + i)

    

     If day <> 1 And day <> 7 Then

        counter = counter + 1

     End If

    

    Next i

   

  TATCounter = counter

 

End Function
