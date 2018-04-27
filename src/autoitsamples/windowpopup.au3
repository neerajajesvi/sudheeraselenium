WinWaitActive("Authentication Required","","10")
   If WinExists("Authentication Required") Then
	 Send("selenium")
	 Send("{TAB}")
	 Send("selenium")
	 ;Send("{Enter}")
   EndIf