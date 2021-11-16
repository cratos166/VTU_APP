package com.nbird.vtusgpacalculator;

public class SubjectsList {
    int semNumber;
    int branchNumber;
    String[] subjectArr;
    int[] creditsArr;

    public SubjectsList(int semNumber, int branchNumber) {
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
                    case 0: CSE_VII();break; case 1: CSE_VII();break; case 2: ECE_VII();break; case 3:ME_VII();break; case 4: EEE_VII();break; case 5: ETE_VII();break; case 6: CIV_VII();break; case 7: BIO_VII();break;
                }break;
            case 7:
                switch (branchNumber){
                    case 0: CSE_VIII();break; case 1: CSE_VIII();break; case 2: ECE_VIII();break; case 3:ME_VIII();break; case 4: EEE_VIII();break; case 5: ETE_VIII();break; case 6: CIV_VIII();break; case 7: BIO_VIII();break;
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

    private void BIO_VIII(){
        subjectArr= new String[]{"Regulatory Affairs in Biotech Industry", "Professional Elective - 4","Project Work Phase - 2","Technical Seminar","Internship"};
        creditsArr=new int[]{3,3,8,1,3};
    }

    private void BIO_VII(){
        subjectArr= new String[]{"Bioprocess Engineering", "Clinical & Pharmaceutical Biotechnology","Professional Elective – 2","Professional Elective – 3","Open Elective –B","Bioprocess Engineering Laboratory","Project Work Phase – 1","Internship"};
        creditsArr=new int[]{4,4,3,3,3,2,2,1};
    }

    private void BIO_VI(){
        subjectArr= new String[]{"Process Control & Automation", "Bioprocess Equipment Design & CAED","Bioinformatics","Professional Elective -1","Open Elective -A","Process Control & Automation Laboratory","Bioinformatics Laboratory","Mini-project","Internship"};
        creditsArr=new int[]{4,4,4,3,3,2,2,2,0};
    }

    private void BIO_V(){
        subjectArr= new String[]{"Bio-Business and Entrepreneurship", "Chemical Reaction Engineering","Enzyme Technology & Biotransformation","Genomics & Proteomics","Bioanalytical Techniques","Genetic Engineering &Applications","Biokinetics & Enzyme Technology Laboratory","Genetic Engineering and Cell Culture Laboratory"};
        creditsArr=new int[]{3,4,4,3,3,3,2,2,1};
    }

    private void BIO_IV(){
        subjectArr= new String[]{"Stoichiometry", "Molecular Biology","Immunotechnology","Cell Culture Techniques","Biochemical Thermodynamics","Clinical Biochemistry","Biochemistry Laboratory","Immunotechnology Laboratory","18KVK39/49 Or 18KAK39/49 Or 18CPC39/49"};
        creditsArr=new int[]{3,4,3,3,3,3,2,2,1};
    }

    private void BIO_III(){
        subjectArr= new String[]{"Biostatistics", "Microbiology","Unit Operations","Introduction to Biomolecules","Cell Biology and Genetics","Python Programming","Microbiology Laboratory","Unit Operations Laboratory","18KVK39/49 Or 18KAK39/49 Or 18CPC39/49"};
        creditsArr=new int[]{3,4,3,3,3,3,2,2,1};
    }

    private void CIV_VIII(){
        subjectArr= new String[]{"Design of Pre-Stressed Concrete", "Professional Elective - 4","Project Work Phase - 2","Technical Seminar","Internship"};
        creditsArr=new int[]{3,3,8,1,3};
    }

    private void CIV_VII(){
        subjectArr= new String[]{"Quality Surveying And Contract Management", "Design of RCC and Steel Structures","Professional Elective - 2","Professional Elective - 3","Open Elective -B","Computer Aided Detailing of Structures","Geotechnical Engineering Laboratory","Project Work Phase - 1","Internship"};
        creditsArr=new int[]{3,3,3,3,3,2,2,1,0};
    }

    private void CIV_VI(){
        subjectArr= new String[]{"Design of Steel Structural Elements", "Applied Geotechnical Engineering","Hydrology and Irrigation Engineering","Professional Elective -1","Open Elective -A","Software Application Laboratory","Environmental Engineering Laboratory","Extensive Survey Project","Internship"};
        creditsArr=new int[]{4,4,4,3,3,2,2,2,0};
    }

    private void CIV_V(){
        subjectArr= new String[]{"Construction Management & Entrepreneurship", "Analysis of Indeterminate Structures","Design of RC Structural Elements","Basic Geotechnical Engineering","Municipal Wastewater Engineering","Highway Engineering","Surveying Practice","Concrete and Highway Materials Laboratory","Environmental Studies"};
        creditsArr=new int[]{3,4,4,3,3,3,2,2,1};
    }

    private void CIV_IV(){
        subjectArr= new String[]{"Complex Analysis, Probability And Statistical Methods", "Analysis of Determinate Structures","Applied Hydraulics","Concrete Technology","Advanced Surveying","Water Supply & Treatment Engineering","Engineering Geology Laboratory","Fluid Mechanics and Hydraulic Machines Laboratory","18KVK39/49 Or 18KAK39/49 Or 18CPC39/49"};
        creditsArr=new int[]{3,4,3,3,3,3,2,2,1};
    }

    private void CIV_III(){
        subjectArr= new String[]{"Transform Calculus, Fourier Series and Numerical Techniques", "Strength of Materials","Fluid Mechanics","Building Materials and Construction","Basic Surveying","Engineering Geology","Computer Aided Building Planning & Drawing","Building Materials Testing Laboratory","18KVK39/49 Or 18KAK39/49 Or 18CPC39/49"};
        creditsArr=new int[]{3,4,3,3,3,3,2,2,1};
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

    private void ETE_VIII(){
        subjectArr= new String[]{"Advanced Cellular Communication", "Professional Elective - 4","Project Work Phase - 2","Technical Seminar","Internship"};
        creditsArr=new int[]{3,3,8,1,3};
    }

    private void ETE_VII(){
        subjectArr= new String[]{"Optical Communication", "Wireless Communication","Professional Elective - 2","Professional Elective - 3","Open Elective -B","Wireless Communication Laboratory","Microwave & Antennas Laboratory","Project Work Phase - 1","Internship"};
        creditsArr=new int[]{4,4,4,3,3,2,2,2,0};
    }

    private void ETE_VI(){
        subjectArr= new String[]{"Digital Communication", "Microwave Theory & Antennas","Computer Communication Networks","Professional Elective -1","Open Elective -A","CCN Laboratory","Analog & Digital Communication Laboratory","Mini-Project","Internship"};
        creditsArr=new int[]{4,4,4,3,3,2,2,2,0};
    }

    private void ETE_V(){
        subjectArr= new String[]{"Technological Innovation Management And Entrepreneurship", "Digital Signal Processing","Principles of Communication Systems","Information Theory & Coding","Electromagnetic Waves","Verilog HDL","Digital Signal Processing Laboratory","HDL Laboratory","Environmental Studies"};
        creditsArr=new int[]{3,4,3,3,3,3,2,2,1};
    }

    private void ETE_IV(){
        subjectArr= new String[]{"Complex Analysis, Probability And Statistical Methods", "Analog Circuits","Control Systems","Engineering Statistics & Linear Algebra","Signals & Systems","Microcontroller","Microcontroller Laboratory","Analog Circuits Laboratory","18KVK39/49 Or 18KAK39/49 Or 18CPC39/49"};
        creditsArr=new int[]{3,4,3,3,3,3,2,2,1};
    }

    private void ETE_III(){
        subjectArr= new String[]{"Transform Calculus, Fourier Series and Numerical Techniques", "Network Theory","Electronic Devices","Digital System Design","Computer Organization & Architecture","Power Electronics & Instrumentation","Electronic Devices & Instrumentation Laboratory","Digital System Design Laboratory","18KVK39/49 Or 18KAK39/49 Or 18CPC39/49"};
        creditsArr=new int[]{3,4,3,3,3,3,2,2,1};
    }

    private void ME_VIII(){
        subjectArr= new String[]{"Energy Engineering", "Professional Elective - 4","Project Work Phase - 2","Technical Seminar","Internship"};
        creditsArr=new int[]{3,3,8,1,3};
    }

    private void ME_VII(){
        subjectArr= new String[]{"Control Engineering", "Computer Aided Design and Manufacturing","Professional Elective - 2","Professional Elective - 3","Open Elective -B","Computer Integrated Manufacturing Lab","Design Lab","Project Work Phase - 1","Internship"};
        creditsArr=new int[]{4,4,4,3,3,2,2,2,0};
    }

    private void ME_VI(){
        subjectArr= new String[]{"Finite Element Methods", "Design of Machine Elements II","Heat Transfer","Professional Elective -1","Open Elective -A","Computer Aided Modelling and Analysis Lab","Heat Transfer Lab","Mini-project","Internship"};
        creditsArr=new int[]{4,4,4,3,3,2,2,2,0};
    }

    private void ME_V(){
        subjectArr= new String[]{"Management and Economics", "Design of Machine Elements I","Dynamics of Machines","Turbo Machines","Fluid Power Engineering","Operations Management","Fluid Mechanics/Machines lab","Energy Conversion Lab","Environmental Studies"};
        creditsArr=new int[]{3,4,4,3,3,3,2,2,1};
    }

    private void ME_IV(){
        subjectArr= new String[]{"Mathematics", "Applied Thermodynamics","Fluid Mechanics","Kinematics of Machines","Metal Cutting And Forming Or Metal Casting and Welding","18ME46A Or 18ME46B","18MEL47A Or 18MEL47B","18MEL48A Or 18MEL48B","18KVK39/49 Or 18KAK39/49 Or 18CPC39"};
        creditsArr=new int[]{3,4,3,3,3,3,2,2,1};
    }

    private void ME_III(){
        subjectArr= new String[]{"Mathematics", "Mechanics of Materials","Basic Thermodynamics","Material Science","Metal cutting and forming","Metal Casting and Welding","18ME36A Or 18ME36B","18MEL37A Or 18MEL37B","18MEL38A Or 18MEL38B","18KVK39/49 Or 18KAK39/49 Or 18CPC39"};
        creditsArr=new int[]{3,4,3,3,3,3,2,2,1};
    }

    private void ECE_VIII(){
        subjectArr= new String[]{"Wireless and Cellular Communication", "Professional Elective - 4","Project Work Phase - 2","Technical Seminar","Internship"};
        creditsArr=new int[]{3,3,8,1,3};
    }

    private void ECE_VII(){
        subjectArr= new String[]{"Computer Networks", "VLSI Design","Professional Elective - 2","Professional Elective - 3","Open Elective -B","Computer Networks Lab","VLSI Laboratory","Project Work Phase - I","Internship"};
        creditsArr=new int[]{4,4,4,3,3,2,2,2,0};
    }

    private void ECE_VI(){
        subjectArr= new String[]{"Digital Communication", "Embedded Systems","Microwave & Antennas","Professional Elective -1","Open Elective –A","Embedded Systems Laboratory","Communication Laboratory","Mini-Project","Internship"};
        creditsArr=new int[]{4,4,4,3,3,2,2,2,0};
    }

    private void ECE_V(){
        subjectArr= new String[]{"Technological Innovation Management And Entrepreneurship", "Digital Signal Processing","Principles of Communication Systems","Information Theory & Coding","Electromagnetic Waves","Verilog HDL","Digital Signal Processing Laboratory","HDL Laboratory","Environmental Studies"};
        creditsArr=new int[]{3,4,4,3,3,3,2,2,1};
    }

    private void ECE_IV(){
        subjectArr= new String[]{"Complex Analysis, Probability And Statistical Methods", "Analog Circuits","Control Systems","Engineering Statistics & Linear Algebra","Signals & Systems","Microcontroller","Microcontroller Laboratory","Analog Circuits Laboratory","18KVK49 Or 18KAK49 Or 18CPC39"};
        creditsArr=new int[]{3,4,3,3,3,3,2,2,1};
    }

    private void ECE_III(){
        subjectArr= new String[]{"Transform Calculus, Fourier Series and Numerical Techniques", "Network Theory","Electronic Devices","Digital System Design","Computer Organization & Architecture","Power Electronics & Instrumentation","Electronic Devices & Instrumentation Laboratory","Digital System Design Laboratory","18KVK49 Or 18KAK49 Or 18CPC39"};
        creditsArr=new int[]{4,4,4,3,3,2,2,2,0};
    }



    private void ISE_VI(){
        subjectArr= new String[]{"File Structures", "Software Testing","Web Technology And Its Applications","Professional Elective -1","Open Elective –A","Software Testing Laboratory","File Structures Laboratory With Mini Project","Mobile Application Development","Internship"};
        creditsArr=new int[]{4,4,4,3,3,2,2,2,0};
    }

    private void CSE_VIII(){
        subjectArr= new String[]{"Internet of Things", "Professional Elective – 4","Project Work Phase – 2","Technical Seminar","Internship"};
        creditsArr=new int[]{3,3,8,1,3};
    }

    private void CSE_VII(){
        subjectArr= new String[]{"Artificial Intelligence and Machine Learning", "Big Data Analytics","Professional Elective – 2","Professional Elective – 3","Open Elective –B","Artificial Intelligence and Machine Learning Laboratory","Project Work Phase – 1","Mobile Application Development","Internship"};
        creditsArr=new int[]{4,4,3,3,3,2,1,0};
    }

    private void CSE_VI(){
        subjectArr= new String[]{"System Software and Compilers", "Computer Graphics and Visualization","Web Technology and its applications","Professional Elective -1","Open Elective –A","System Software Laboratory","Computer Graphics Laboratory With Mini Project","Mobile Application Development","Internship"};
        creditsArr=new int[]{4,4,4,3,3,2,2,2,0};
    }

    private void CSE_V(){
        subjectArr= new String[]{"Management, Entrepreneurship for IT idustry", "Computer Networks and Security","Database Management System","Automata theory and Computability","Application Development using Python","Unix Programming","Computer Network Laboratory","DBMS Laboratory with mini project","Environmental Studies"};
        creditsArr=new int[]{3,4,4,3,3,3,2,2,1};
    }

    private void CSE_IV(){
        subjectArr= new String[]{"Complex Analysis, Probability and Statistical Method", "Design and Analysis of Algorithms","Operating Systems","Microcontroller and Embedded CS/IS Systems","Object Oriented Concepts","Data Communication","Design and Analysis of Algorithm Laboratory","Microcontroller and Embedded Systems Laboratory","18KVK49 Or 18KAK49 Or 18CPC39"};
        creditsArr=new int[]{3,4,3,3,3,3,2,2,1};
    }

    private void CSE_III(){
        subjectArr= new String[]{"Transform Calculus, Fourier Series And Numerical Techniques", "Data Structures and Applications","Analog and Digital Electronics","Computer Organization","Software Engineering","Discrete Mathematical Structures","Analog and Digital Electronics Laboratory","Data Structures Laboratory","18KVK39 OR 18KAK39 OR 18CPC39"};
        creditsArr=new int[]{3,4,3,3,3,3,2,2,1};
    }

    private void CSE_I(){
        subjectArr= new String[]{"Calculus And Linear Algebra", "Engineering Physics","Basic Electrical Engineering","Elements Of Civil Engineering And Mechanics","Engineering Graphics","Engineering Physics Laboratory","Basic Electrical Engineering Laboratory","Technical English-I"};
        creditsArr=new int[]{4,4,3,3,3,1,1,1};
    }

    private void ME_I(){
        subjectArr= new String[]{"Advanced Calculus And Numerical Methods", "Engineering Chemistry","C Programming For Problem Solving","Basic Electronics","Elements Of Mechanical Engineering","Engineering Chemistry Laboratory","C Programming Laboratory","Technical English-II"};
        creditsArr=new int[]{4,4,4,4,4,2,2,0};
    }





}
