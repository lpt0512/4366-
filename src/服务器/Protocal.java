package server;

public interface Protocal {
	// USER
	int A_ADDUSER = 1001;
	int A_DELETEUSER = 1002;
	int A_GETUSER = 1003;
	int A_UPDATEUSER = 1004;
	int A_LOGIN = 1005;

	// ADMIN
	int U_LOGIN = 2001;
	int U_REGISTER = 2002;
	int U_ALTERNAME = 2003;
	int U_ALTERPW = 2004;

	// DIFFERENCE
	int D_UPSCOREL3 = 3001;
	int D_JUDGE = 3002;
	int D_EXTRACT = 3003;
	int D_RANKLIST1 = 3004;

	// TF
	int TF_CONTRAST = 4001;
	int TF_UPSCOREL1 = 4002;
	int TF_RANKLIST = 4003;

	// TZ
	int TZ_UPSCOREL2 = 5001;
	int TZ_RANKLIST2 = 5002;
	
	int PH_COMPARETO = 6001;
	int PH_COMPARETO2 = 6002;
}
