package com.nbird.vtusgpacalculator;

public class SubjectsList2021 {
    int semNumber;
    int branchNumber;
    String[] subjectArr;
    int[] creditsArr;

    public SubjectsList2021(int semNumber, int branchNumber) {
        this.semNumber = semNumber;
        this.branchNumber = branchNumber;
    }




    public int getSemNumber() {
        return semNumber;
    }

    public void setSemNumber(int semNumber) {
        this.semNumber = semNumber;
    }

    public int getBranchNumber() {
        return branchNumber;
    }

    public void setBranchNumber(int branchNumber) {
        this.branchNumber = branchNumber;
    }


     /*CSE=0
       ISE=1
       ECE=2

       ME=3
       EEE=4
       TE=5
       CIVIL=6
       BTE=7    */

    public void start(){
        switch (semNumber){
            case 0:
                switch (branchNumber){
                    case 0: CSE_I();break; case 1: CSE_I();break; case 2: CSE_I();break; case 3: ME_I();break; case 4: ME_I();break; case 5: CSE_I();break; case 6: ME_I();break; case 7: ME_I();break;
                }break;
            case 1:
                switch (branchNumber){
                    case 0: ME_I();break; case 1: ME_I();break; case 2: ME_I();break; case 3: CSE_I();break; case 4: CSE_I();break; case 5: ME_I();break; case 6: CSE_I();break; case 7: CSE_I();break;
                }break;
            case 2:
                switch (branchNumber){
                    case 0: CSE_III();break; case 1: CSE_III();break; case 2: ECE_III();break; case 3:ME_III();break; case 4: EEE_III();break; case 5: ETE_III();break; case 6: CIV_III();break; case 7: BIO_III();break;
                }break;
            case 3:
                switch (branchNumber){
                    case 0: CSE_IV();break; case 1: CSE_IV();break; case 2: ECE_IV();break; case 3:ME_IV();break; case 4: EEE_IV();break; case 5: ETE_IV();break; case 6: CIV_IV();break; case 7: BIO_IV();break;
                }break;
            case 4:
                switch (branchNumber){
                    case 0: CSE_V();break; case 1: CSE_V();break; case 2: ECE_V();break; case 3:ME_V();break; case 4: EEE_V();break; case 5: ETE_V();break; case 6: CIV_V();break; case 7: BIO_V();break;
                }break;
            case 5:
                switch (branchNumber){
                    case 0: CSE_VI();break; case 1: ISE_VI();break; case 2: ECE_VI();break; case 3:ME_VI();break; case 4: EEE_VI();break; case 5: ETE_VI();break; case 6: CIV_VI();break; case 7: BIO_VI();break;
                }break;
            case 6:
                switch (branchNumber){
                    case 0: CSE_VII();break; case 1: ISE_VII();break; case 2: ECE_VII();break; case 3:ME_VII();break; case 4: EEE_VII();break; case 5: ETE_VII();break; case 6: CIV_VII();break; case 7: BIO_VII();break;
                }break;
            case 7:
                switch (branchNumber){
                    case 0: CSE_VIII();break; case 1: CSE_VIII();break; case 2: CSE_VIII();break; case 3:CSE_VIII();break; case 4: EEE_VIII();break; case 5: CSE_VIII();break; case 6: CSE_VIII();break; case 7: CSE_VIII();break;
                }break;
        }
    }


    public String[] getSubjectArr() {
        return subjectArr;
    }

    public void setSubjectArr(String[] subjectArr) {
        this.subjectArr = subjectArr;
    }

    public int[] getSemsArr() {
        return creditsArr;
    }

    public void setSemArr(int[] creditsArr) {
        this.creditsArr = creditsArr;
    }

    private void BIO_VII(){
        subjectArr= new String[]{"Upstream &Downstream Bioprocess Technology", "Bioethics and Biosafety","Professional Elective – II","Professional Elective – III","Open Elective –II","Project"};
        creditsArr=new int[]{3,2,3,3,3,10};
    }

    private void BIO_VI(){
        subjectArr= new String[]{"Biobusiness Management and Entrepreneurship", "Bioprocess Principles, Control &Automation + Lab","Enzyme Technology","Professional elective course-I","Open Elective -I","Enzyme Technology lab","Mini-project","Innovation/Entrepreneurship /Societal Internship"};
        creditsArr=new int[]{3,4,3,3,3,1,2,3};
    }

    private void BIO_V(){
        subjectArr= new String[]{"Biokinetics &Bioreaction engineering", "Immunotechnology+lab","Structural biology &Analytical techniques","Genomics, Proteomics &Bioinformatics","Bioinformatics lab","Research methodology & Intellectual property rights","Environmental Studies Ability Enhancement Course-V"};
        creditsArr=new int[]{3,4,3,3,1,2,1,1};
    }

    private void BIO_IV(){
        subjectArr= new String[]{"Biostatistics and Design of experiments", "Python programming + lab","Cell biology &Cell culture techniques + lab","Molecular biology &Genetic engineering","Biology for engineers","Molecular biology &Genetic engineering lab","Kannada","Ability Enhancement Course- IV","Universal Human Values","Inter/Intra Institutional Internship"};
        creditsArr=new int[]{3,4,4,3,2,1,1,1,1,2};
    }

    private void BIO_III(){
        subjectArr= new String[]{"Mathematics course", "Unit operations + lab","Biochemistry + lab","Microbiology","Microbiology lab","Social Connect and Responsibility","Kannada","Ability Enhancement Course - III"};
        creditsArr=new int[]{3,4,4,3,1,1,1,1};
    }

    private void CIV_VII(){
        subjectArr= new String[]{"Quality Surveying And Contract Management", "Construction Technology for Substructure and Super Structures","Professional Elective - II","Professional Elective - IIi","Open Elective -II","Project work"};
        creditsArr=new int[]{3,2,3,3,3,10};
    }

    private void CIV_VI(){
        subjectArr= new String[]{"Construction Management and Entrepreneurship", "Geo Technical Engineering","Design of Steel structure","Professional Elective Course-I","Open Elective -I","Computer Aided Detailing of Structure","Mini Project","Innovation/Entrepreneurship /Societal Internship"};
        creditsArr=new int[]{3,4,3,3,3,1,2,3};
    }

    private void CIV_V(){
        subjectArr= new String[]{"Hydrology and Water Resources Engineering", "Transportation Engineering","Design of RC Structural Elements","Concrete Technology and Smart Materials","Concrete Laboratory","Research Methodology & Intellectual Property Rights","Environmental Studies","Ability Enhancement Course-V"};
        creditsArr=new int[]{3,4,3,3,1,2,1,1};
    }

    private void CIV_IV(){
        subjectArr= new String[]{"Complex Analysis, Probability And Statistical Methods", "Fluid Mechanics and Hydraulics","Public Health Engineering","Analysis of Structures","Biology for Engineers","Engineering Geology Lab","Kannada","Ability Enhancement Course- IV","Universal Human Values","Inter/Intra Institutional Internship"};
        creditsArr=new int[]{3,4,4,3,2,1,1,1,1,2};
    }

    private void CIV_III(){
        subjectArr= new String[]{"Transform Calculus, Fourier Series and Numerical Techniques", "Geodetic Engineering","Strength of Materials","Earth Resources and Engineering","Computer Aided Building Planning and Drawing","Social Connect and Responsibility","Kannada","Ability Enhancement Course - III"};
        creditsArr=new int[]{3,4,4,3,1,1,1,1};
    }

    private void EEE_VIII(){
        subjectArr= new String[]{"Power System Operation and Control", "Professional Elective - 4","Project Work Phase - 2","Technical Seminar","Internship"};
        creditsArr=new int[]{3,3,8,1,3};
    }

    private void EEE_VII(){
        subjectArr= new String[]{"Power System Analysis – 2", "Power System Protection","Professional Elective - 2","Professional Elective - 3","Open Elective -B","PSS laboratory","Relay & HV lab","Project Work Phase - 1","Internship"};
        creditsArr=new int[]{3,3,3,3,3,2,2,1,0};
    }

    private void EEE_VI(){
        subjectArr= new String[]{"Control Systems", "Power System Analysis – 1","Digital Signal Processing","Professional Elective -1","Open Elective -A","Control System Laboratory","Digital Signal Processing Laboratory","Mini-Project","Internship"};
        creditsArr=new int[]{4,4,4,3,3,2,2,2,0};
    }

    private void EEE_V(){
        subjectArr= new String[]{"Management and Entrepreneurship", "Microcontroller","Power Electronics","Signals and Systems","Electrical Machine Design","High V oltage Engineering","Microcontroller Laboratory","Power Electronics Laboratory","Environmental Studies"};
        creditsArr=new int[]{3,4,4,3,3,3,2,2,1};
    }

    private void EEE_IV(){
        subjectArr= new String[]{"Complex Analysis, Probability And Statistical Methods", "Power Generation and Economics","Transmission and Distribution","Electric Motors","Electromagnetic Field Theory","Operational Amplifiers and Linear EEE 3 ICs","Electrical Machines Laboratory -2","Op- amp and Linear ICs EEE Laboratory","18KVK39/49 Or 18KAK39/49 Or 18CPC39/49"};
        creditsArr=new int[]{3,3,4,3,3,3,2,2,1};
    }

    private void EEE_III(){
        subjectArr= new String[]{"Transform Calculus, Fourier Series and Numerical Techniques", "Electric Circuit Analysis","Transformers and Generators","Analog Electronic Circuits","Digital System Design","Electrical and Electronic Measurements","Electrical Machines Laboratory -1","Electronics Laboratory","18KVK39/49 Or 18KAK39/49 Or 18CPC39/49"};
        creditsArr=new int[]{3,4,3,3,3,3,2,2,1};
    }

    private void ETE_VII(){
        subjectArr= new String[]{"VLSI Circuits & Systems", "Optical Communication and Optical networks","Professional elective Course-II","Professional Elective - III","Open Elective -II","Project work"};
        creditsArr=new int[]{3,2,3,3,3,10};
    }

    private void ETE_VI(){
        subjectArr= new String[]{"Technological Innovation Management and Entrepreneurship", "Computer Organization & ARM Microcontrollers","Wireless and Cellular Communication","Professional Elective Course-I","Open Elective -I","Wireless and Cellular Communication Laboratory","Mini Project","Innovation/Entrepreneurship /Societal Internship"};
        creditsArr=new int[]{3,4,3,3,3,1,2,3};
    }

    private void ETE_V(){
        subjectArr= new String[]{"Digital Communication", "Object Oriented Programming with Java & Data Structures","Computer Communication Networks","Microwave Theory & Antennas","Communication Lab II","Research Methodology & Intellectual Property Rights","Environmental Studies","Ability Enhancement Course-V"};
        creditsArr=new int[]{3,4,3,3,1,2,1,1};
    }

    private void ETE_IV(){
        subjectArr= new String[]{"Maths for Communication Engineers", "Digital Signal Processing","Circuits & Controls","Communication Theory","Biology For Engineers","Communication Laboratory I","Kannada","Ability Enhancement Course- IV","Universal Human Values","Inter/Intra Institutional Internship"};
        creditsArr=new int[]{3,4,4,3,2,1,1,1,1,2};
    }

    private void ETE_III(){
        subjectArr= new String[]{"Mathematics Course", "Digital System Design using Verilog","Basic Signal Processing","Analog Electronic Circuits","Analog and Digital Electronics Lab","Social Connect and Responsibility","Kannada","Ability Enhancement Course - III"};
        creditsArr=new int[]{3,4,4,3,1,1,1,1};
    }

    private void ME_VII(){
        subjectArr= new String[]{"Automation and Robotics", "Control Engg","Professional Elective - II","Professional Elective - III","Open Elective -II","Project work"};
        creditsArr=new int[]{3,2,3,3,3,10};
    }

    private void ME_VI(){
        subjectArr= new String[]{"Production and Operations Management", "Heat Transfer","Machine design","ProfessionalElective Course-I","Open Elective -I","CNC Programming and 3-D Printing Lab","Mini Project","Innovation/Entrepreneurship /Societal Internship"};
        creditsArr=new int[]{3,4,3,3,3,1,2,3};
    }

    private void ME_V(){
        subjectArr= new String[]{"Theory of Machines", "Thermo-fluids Engineering","Finite Element Analysis","Modern Mobility and Automotive Mechanics","Design lab","Research Methodology & Intellectual Property Rights","Environmental Studies","Ability Enhancement Course-V"};
        creditsArr=new int[]{3,4,3,3,1,2,1,1};
    }

    private void ME_IV(){
        subjectArr= new String[]{"Complex Analysis, Probability and Linear Programming", "Machining Science and Jigs & Fixtures","Fluid Mechanics","Mechanics of Materials","Biology For Engineers","Mechanical Measurements and Metrology Lab","Kannada","Ability Enhancement Course- IV","UniversalHumanValues","Inter/Intra Institutional Internship"};
        creditsArr=new int[]{3,4,4,3,2,1,1,1,1,2};
    }

    private void ME_III(){
        subjectArr= new String[]{"Transform Calculus, Fourier Series And Numerical Techniques", "Metal casting, Forming and Joining Processes","Material Science and Engineering","Thermodynamics","Machine Drawing and GD & T","Social Connect and Responsibility","Kannada","Ability Enhancement Course-III"};
        creditsArr=new int[]{3,4,4,3,1,1,1,1};
    }

    private void ECE_VII(){
        subjectArr= new String[]{"Advanced VLSI", "Optical & Wireless Communication","Professional Elective - II","Professional Elective - III","Open Elective -II","Project work"};
        creditsArr=new int[]{3,2,3,3,3,10};
    }

    private void ECE_VI(){
        subjectArr= new String[]{"Technological Innovation Management and Entrepreneurship", "Computer Organization & ARM Microcontrollers","VLSI Design & Testing","Professional Elective Course-I","Open Elective Course-I","VLSI Laboratory","Mini Project","Innovation/Entrepreneurship /Societal Internship"};
        creditsArr=new int[]{3,4,3,3,3,1,2,3};
    }

    private void ECE_V(){
        subjectArr= new String[]{"Digital Communication", "Object Oriented Programming with Java & Data Structures","Computer Communication Networks","Microwave Theory & Antennas","Communication Lab II","Research Methodology & Intellectual Property Rights","Environmental Studies","Ability Enhancement Course-V"};
        creditsArr=new int[]{3,4,4,3,3,3,2,2,1};
    }

    private void ECE_IV(){
        subjectArr= new String[]{"Maths for Communication Engineers", "Digital Signal Processing","Circuits & Controls","Communication Theory","Biology For Engineers","Communication Laboratory I","Kannada","Ability Enhancement Course- IV","Universal Human Values","Inter/Intra Institutional Internship"};
        creditsArr=new int[]{3,4,3,3,1,2,1,1};
    }

    private void ECE_III(){
        subjectArr= new String[]{"Mathematics Course (Common to all)", "Digital System Design using Verilog","Basic Signal Processing","Analog Electronic Circuits","Analog & Digital Electronics Lab","Social Connect and Responsibility","Kannada","Ability Enhancement Course - III"};
        creditsArr=new int[]{3,4,4,3,1,1,1,1};
    }

    private void ISE_VII(){
        subjectArr= new String[]{"Cryptography and Network Security", "Cloud Computing","Professional elective Course-II","Professional elective Course-III","Open Elective –B","Open elective Course-II","Project work"};
        creditsArr=new int[]{3,2,3,3,3,10};
    }

    private void ISE_VI(){
        subjectArr= new String[]{"Software Engineering and Project Management", "Fullstack Development","Software Testing","Professional Elective Course-I","Open Elective Course-I","Software Testing Laboratory","Mini Project","Innovation/Entrepreneurship /Societal Internship"};
        creditsArr=new int[]{3,4,3,3,3,1,2,3};
    }

    private void CSE_VIII(){
        subjectArr= new String[]{"Technical Seminar", "Research Internship/ Industry Internship","National Service Scheme (NSS)/ Physical Education (PE)/ Yoga "};
        creditsArr=new int[]{1,15,0};
    }

    private void CSE_VII(){
        subjectArr= new String[]{"Big Data Analytics", "Cloud Computing","Professional elective Course-II","Professional elective Course-III","Open Elective Course–II","Project work"};
        creditsArr=new int[]{3,2,3,3,3,10};
    }

    private void CSE_VI(){
        subjectArr= new String[]{"Software Engineering and Project Management", "Fullstack Development","Computer Graphics and Fundamentals of Image Processing","Professional Elective Course-I","Open Elective Course-I","Computer Graphics and Image Processing Laboratory","Mini Project","Innovation/Entrepreneurship /Societal Internship"};
        creditsArr=new int[]{3,4,3,3,3,1,2,3};
    }

    private void CSE_V(){
        subjectArr= new String[]{"Automata Theory and compiler Design", "Computer Networks","Database Management Systems","Artificial Intelligence and Machine Learning","Database Management Systems Laboratory with Mini Project","Research Methodology & Intellectual Property Rights","Environmental Studies","Ability Enhancement Course-V"};
        creditsArr=new int[]{3,4,3,3,1,2,1,1};
    }

    private void CSE_IV(){
        subjectArr= new String[]{"Mathematical Foundations for Computing", "Design and Analysis of Algorithms","Operating Systems","Biology For Engineers","Python Programming Laboratory",
                "Constitution of India & Professional Ethics","Ability Enhancement Course- IV","Universal Human Values","Inter/Intra Institutional Internship"};
        creditsArr=new int[]{3,4,4,3,2,1,1,1,1,2};
    }

    private void CSE_III(){
        subjectArr= new String[]{"Transform Calculus, Fourier Series And Numerical Techniques", "Data Structures and Applications","Analog and Digital Electronics","Computer Organization and Architecture","Object Oriented Programming with JAVA Laboratory","Social Connect and Responsibility","Kannada","Ability Enhancement Course - III"};
        creditsArr=new int[]{3,4,4,3,1,1,1,1};
    }

    private void CSE_I(){
        subjectArr= new String[]{"Calculus & Differential Equations", "Engineering Physics","Basic Electrical Engineering","Elements Of Civil Engineering And Mechanics","Engineering Visualization","Engineering Physics Laboratory","Basic Electrical Engineering Laboratory","Communicative English","Innovation and Design Thinking"};
        creditsArr=new int[]{3,3,3,3,3,1,1,2,1};
    }

    private void ME_I(){
        subjectArr= new String[]{"Advanced Calculus And Numerical Methods", "Engineering Chemistry","Problem-Solving through Programming","Basic Electronics & Communication Engineering","Elements Of Mechanical Engineering","Engineering Chemistry Laboratory","Computer Programming Laboratory","Professional Writing Skills in English","Scientific Foundations of Health"};
        creditsArr=new int[]{3,3,3,3,3,1,1,2,1};
    }
}