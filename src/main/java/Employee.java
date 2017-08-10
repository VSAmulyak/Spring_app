public class Employee {


    @Document(collection =”employees”)
    private class Employee {

        @Id
        private String EID;

        private String email;
        private String Ename;
        private String managerEmail;

        public String getEmail() {
            return email;
        }

        public String getEname() {
            return Ename;
        }

        public void setEID(String EID) {
            this.EID = EID;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setEname(String ename) {
            Ename = ename;
        }

        public void setManagerEmail(String managerEmail) {
            this.managerEmail = managerEmail;
        }

        public String getManagerEmail() {
            return managerEmail;
        }

        public String getEID() {
            return EID;

        }
    }
