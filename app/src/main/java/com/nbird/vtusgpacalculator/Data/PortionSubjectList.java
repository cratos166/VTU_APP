package com.nbird.vtusgpacalculator.Data;

public class PortionSubjectList {
    int sem;
    int branch;
    int scheme;
    String[] subjectArr;


    public PortionSubjectList(int scheme, int sem, int branch) {
        this.sem = sem;
        this.branch = branch;
        this.scheme = scheme;
    }

    public String[] getSubjectArr() {

        if (scheme == 0) {
            dataSetter();
            return subjectArr;
        } else {
            dataSetter2021();
            return subjectArr;
        }
    }

    private void dataSetter2021() {
        if ((sem == 1 || sem == 2) && branch != 2) {
            First_Year2021();
            return;
        }

        switch (branch) {
            case 0:
                switch (sem) {
                    case 3:
                        Aeronautical_Engineering_III2021();
                        break;
                    case 4:
                        Aeronautical_Engineering_IV2021();
                        break;
                    case 5:
                        Aeronautical_Engineering_V2021();
                        break;
                    case 6:
                        Aeronautical_Engineering_VI2021();
                        break;
                    case 7:
                        Aeronautical_Engineering_VII2021();
                        break;
                    case 8:
                        Computer_Science_Engineering_VII2021();
                        break;
                }
                break;
            case 1:
                switch (sem) {
                    case 3:
                        Aerospace_Engineering_III2021();
                        break;
                    case 4:
                        Aerospace_Engineering_IV2021();
                        break;
                    case 5:
                        Aerospace_Engineering_V2021();
                        break;
                    case 6:
                        Aerospace_Engineering_VI2021();
                        break;
                    case 7:
                        Aerospace_Engineering_VII2021();
                        break;
                    case 8:
                        common_VIII2021();
                        break;
                }
                break;
            case 2:
                switch (sem) {
                    case 1:
                        Architecture_I2021();
                        break;
                    case 2:
                        Architecture_II2021();
                        break;
                    case 3:
                        Architecture_III2021();
                        break;
                    case 4:
                        Architecture_IV2021();
                        break;
                    case 5:
                        Architecture_V2021();
                        break;
                    case 6:
                        Architecture_VI2021();
                        break;
                    case 7:
                        Architecture_VII2021();
                        break;
                    case 8:
                        Architecture_VIII2021();
                        break;
                }
                break;
            case 3:
                switch (sem) {
                    case 3:
                        Biomedical_Engineering_III2021();
                        break;
                    case 4:
                        Biomedical_Engineering_IV2021();
                        break;
                    case 5:
                        Biomedical_Engineering_V2021();
                        break;
                    case 6:
                        Biomedical_Engineering_VI2021();
                        break;
                    case 7:
                        Biomedical_Engineering_VII2021();
                        break;
                    case 8:
                        common_VIII2021();
                        break;
                }
                break;
            case 4:
                switch (sem) {
                    case 3:
                        Biotechnology_III2021();
                        break;
                    case 4:
                        Biotechnology_IV2021();
                        break;
                    case 5:
                        Biotechnology_V2021();
                        break;
                    case 6:
                        Biotechnology_VI2021();
                        break;
                    case 7:
                        Biotechnology_VII2021();
                        break;
                    case 8:
                        common_VIII2021();
                        break;
                }
                break;
            case 5:
                switch (sem) {
                    case 3:
                        Chemical_Engineering_III2021();
                        break;
                    case 4:
                        Chemical_Engineering_IV2021();
                        break;
                    case 5:
                        Chemical_Engineering_V2021();
                        break;
                    case 6:
                        Chemical_Engineering_VI2021();
                        break;
                    case 7:
                        Chemical_Engineering_VII2021();
                        break;
                    case 8:
                        common_VIII2021();
                        break;
                }
                break;
            case 6:
                switch (sem) {
                    case 3:
                        Civil_Engineering_III2021();
                        break;
                    case 4:
                        Civil_Engineering_IV2021();
                        break;
                    case 5:
                        Civil_Engineering_V2021();
                        break;
                    case 6:
                        Civil_Engineering_VI2021();
                        break;
                    case 7:
                        Civil_Engineering_VII2021();
                        break;
                    case 8:
                        common_VIII2021();
                        break;
                }
                break;
            case 7:
                switch (sem) {
                    case 3:
                        Computer_Science_Engineering_III2021();
                        break;
                    case 4:
                        Computer_Science_Engineering_IV2021();
                        break;
                    case 5:
                        Computer_Science_Engineering_V2021();
                        break;
                    case 6:
                        Computer_Science_Engineering_VI2021();
                        break;
                    case 7:
                        Computer_Science_Engineering_VII2021();
                        break;
                    case 8:
                        common_VIII2021();
                        break;
                }
                break;
            case 8:
                switch (sem) {
                    case 3:
                        Electrical_Electronics_Engineering_III2021();
                        break;
                    case 4:
                        Electrical_Electronics_Engineering_IV2021();
                        break;
                    case 5:
                        Electrical_Electronics_Engineering_V2021();
                        break;
                    case 6:
                        Electrical_Electronics_Engineering_VI2021();
                        break;
                    case 7:
                        Electrical_Electronics_Engineering_VII2021();
                        break;
                    case 8:
                        common_VIII2021();
                        break;
                }
                break;
            case 9:
                switch (sem) {
                    case 3:
                        Electronics_Communication_Engineering_III2021();
                        break;
                    case 4:
                        Electronics_Communication_Engineering_IV2021();
                        break;
                    case 5:
                        Electronics_Communication_Engineering_V2021();
                        break;
                    case 6:
                        Electronics_Communication_Engineering_VI2021();
                        break;
                    case 7:
                        Electronics_Communication_Engineering_VII2021();
                        break;
                    case 8:
                        common_VIII2021();
                        break;
                }
                break;
            case 10:
                switch (sem) {
                    case 3:
                        Electronics_Instrumentation_Engineering_III2021();
                        break;
                    case 4:
                        Electronics_Instrumentation_Engineering_IV2021();
                        break;
                    case 5:
                        Electronics_Instrumentation_Engineering_V2021();
                        break;
                    case 6:
                        Electronics_Instrumentation_Engineering_VI2021();
                        break;
                    case 7:
                        Electronics_Instrumentation_Engineering_VII2021();
                        break;
                    case 8:
                        common_VIII2021();
                        break;
                }
                break;
            case 11:
                switch (sem) {
                    case 3:
                        Electronics_Telecommunication_Engineering_III2021();
                        break;
                    case 4:
                        Electronics_Telecommunication_Engineering_IV2021();
                        break;
                    case 5:
                        Electronics_Telecommunication_Engineering_V2021();
                        break;
                    case 6:
                        Electronics_Telecommunication_Engineering_VI2021();
                        break;
                    case 7:
                        Electronics_Telecommunication_Engineering_VII2021();
                        break;
                    case 8:
                        common_VIII2021();
                        break;
                }
                break;
            case 12:
                switch (sem) {
                    case 3:
                        Industrial_Production_Engineering_III2021();
                        break;
                    case 4:
                        Industrial_Production_Engineering_IV2021();
                        break;
                    case 5:
                        Industrial_Production_Engineering_V2021();
                        break;
                    case 6:
                        Industrial_Production_Engineering_VI2021();
                        break;
                    case 7:
                        Industrial_Production_Engineering_VII2021();
                        break;
                    case 8:
                        common_VIII2021();
                        break;
                }
                break;
            case 13:
                switch (sem) {
                    case 3:
                        Information_Science_Engineering_III2021();
                        break;
                    case 4:
                        Information_Science_Engineering_IV2021();
                        break;
                    case 5:
                        Information_Science_Engineering_V2021();
                        break;
                    case 6:
                        Information_Science_Engineering_VI2021();
                        break;
                    case 7:
                        Information_Science_Engineering_VII2021();
                        break;
                    case 8:
                        common_VIII2021();
                        break;
                }
                break;
            case 14:
                switch (sem) {
                    //todo manufacturing science engineering not available 2021
                    case 3:
                        Manufacturing_Science_Engineering_III();
                        break;
                    case 4:
                        Manufacturing_Science_Engineering_IV();
                        break;
                    case 5:
                        Manufacturing_Science_Engineering_V();
                        break;
                    case 6:
                        Manufacturing_Science_Engineering_VI();
                        break;
                    case 7:
                        Manufacturing_Science_Engineering_VII();
                        break;
                    case 8:
                        Manufacturing_Science_Engineering_VIII();
                        break;
                }
                break;
            case 15:
                switch (sem) {
                    case 3:
                        Marine_Engineering_III2021();
                        break;
                    case 4:
                        Marine_Engineering_IV2021();
                        break;
                    case 5:
                        Marine_Engineering_V2021();
                        break;
                    case 6:
                        Marine_Engineering_VI2021();
                        break;
                    case 7:
                        Marine_Engineering_VII2021();
                        break;
                    case 8:
                        Marine_Engineering_VIII2021();
                        break;
                }
                break;
            case 16:
                switch (sem) {
                    case 3:
                        Mechanical_Engineering_III2021();
                        break;
                    case 4:
                        Mechanical_Engineering_IV2021();
                        break;
                    case 5:
                        Mechanical_Engineering_V2021();
                        break;
                    case 6:
                        Mechanical_Engineering_VI2021();
                        break;
                    case 7:
                        Mechanical_Engineering_VII2021();
                        break;
                    case 8:
                        common_VIII2021();
                        break;
                }
                break;
            case 17:
                switch (sem) {
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        Mechatronics2021();
                        break;
                }
                break;
            case 18:
                switch (sem) {
                    //todo medical electronics not available 2021
                    case 3:
                        Medical_Electronics_III();
                        break;
                    case 4:
                        Medical_Electronics_IV();
                        break;
                    case 5:
                        Medical_Electronics_V();
                        break;
                    case 6:
                        Medical_Electronics_VI();
                        break;
                    case 7:
                        Medical_Electronics_VII();
                        break;
                    case 8:
                        Medical_Electronics_VIII();
                        break;
                }
                break;
            case 19:
                switch (sem) {
                    case 3:
                        Mining_Engineering_III2021();
                        break;
                    case 4:
                        Mining_Engineering_IV2021();
                        break;
                    case 5:
                        Mining_Engineering_V2021();
                        break;
                    case 6:
                        Mining_Engineering_VI2021();
                        break;
                    case 7:
                        Mining_Engineering_VII2021();
                        break;
                    case 8:
                        common_VIII2021();
                        break;
                }
                break;
            case 20:
                switch (sem) {
                    //todo nano tech not available 2021 scheme
                    case 3:
                        Nano_Technology_III();
                        break;
                    case 4:
                        Nano_Technology_IV();
                        break;
                    case 5:
                        Nano_Technology_V();
                        break;
                    case 6:
                        Nano_Technology_VI();
                        break;
                    case 7:
                        Nano_Technology_VII();
                        break;
                    case 8:
                        Nano_Technology_VIII();
                        break;
                }
                break;
            case 21:
                switch (sem) {
                    //todo petrochem engineering not available scheme 2021
                    case 3:
                        Petrochem_Engineering_III();
                        break;
                    case 4:
                        Petrochem_Engineering_IV();
                        break;
                    case 5:
                        Petrochem_Engineering_V();
                        break;
                    case 6:
                        Petrochem_Engineering_VI();
                        break;
                    case 7:
                        Petrochem_Engineering_VII();
                        break;
                    case 8:
                        Petrochem_Engineering_VIII();
                        break;
                }
                break;
        }
    }

    private void dataSetter() {
        if ((sem == 1 || sem == 2) && branch != 2) {
            First_Year();
            return;
        }

        switch (branch) {
            case 0:
                switch (sem) {
                    case 3:
                        Aeronautical_Engineering_III();
                        break;
                    case 4:
                        Aeronautical_Engineering_IV();
                        break;
                    case 5:
                        Aeronautical_Engineering_V();
                        break;
                    case 6:
                        Aeronautical_Engineering_VI();
                        break;
                    case 7:
                        Aeronautical_Engineering_VII();
                        break;
                    case 8:
                        Aeronautical_Engineering_VIII();
                        break;
                }
                break;
            case 1:
                switch (sem) {
                    case 3:
                        Aerospace_Engineering_III();
                        break;
                    case 4:
                        Aerospace_Engineering_IV();
                        break;
                    case 5:
                        Aerospace_Engineering_V();
                        break;
                    case 6:
                        Aerospace_Engineering_VI();
                        break;
                    case 7:
                        Aerospace_Engineering_VII();
                        break;
                    case 8:
                        Aerospace_Engineering_VIII();
                        break;
                }
                break;
            case 2:
                switch (sem) {
                    case 1:
                        Architecture_I();
                        break;
                    case 2:
                        Architecture_II();
                        break;
                    case 3:
                        Architecture_III();
                        break;
                    case 4:
                        Architecture_IV();
                        break;
                    case 5:
                        Architecture_V();
                        break;
                    case 6:
                        Architecture_VI();
                        break;
                    case 7:
                        Architecture_VII();
                        break;
                    case 8:
                        Architecture_VIII();
                        break;
                }
                break;
            case 3:
                switch (sem) {
                    case 3:
                        Biomedical_Engineering_III();
                        break;
                    case 4:
                        Biomedical_Engineering_IV();
                        break;
                    case 5:
                        Biomedical_Engineering_V();
                        break;
                    case 6:
                        Biomedical_Engineering_VI();
                        break;
                    case 7:
                        Biomedical_Engineering_VII();
                        break;
                    case 8:
                        Biomedical_Engineering_VIII();
                        break;
                }
                break;
            case 4:
                switch (sem) {
                    case 3:
                        Biotechnology_III();
                        break;
                    case 4:
                        Biotechnology_IV();
                        break;
                    case 5:
                        Biotechnology_V();
                        break;
                    case 6:
                        Biotechnology_VI();
                        break;
                    case 7:
                        Biotechnology_VII();
                        break;
                    case 8:
                        Biotechnology_VIII();
                        break;
                }
                break;
            case 5:
                switch (sem) {
                    case 3:
                        Chemical_Engineering_III();
                        break;
                    case 4:
                        Chemical_Engineering_IV();
                        break;
                    case 5:
                        Chemical_Engineering_V();
                        break;
                    case 6:
                        Chemical_Engineering_VI();
                        break;
                    case 7:
                        Chemical_Engineering_VII();
                        break;
                    case 8:
                        Chemical_Engineering_VIII();
                        break;
                }
                break;
            case 6:
                switch (sem) {
                    case 3:
                        Civil_Engineering_III();
                        break;
                    case 4:
                        Civil_Engineering_IV();
                        break;
                    case 5:
                        Civil_Engineering_V();
                        break;
                    case 6:
                        Civil_Engineering_VI();
                        break;
                    case 7:
                        Civil_Engineering_VII();
                        break;
                    case 8:
                        Civil_Engineering_VIII();
                        break;
                }
                break;
            case 7:
                switch (sem) {
                    case 3:
                        Computer_Science_Engineering_III();
                        break;
                    case 4:
                        Computer_Science_Engineering_IV();
                        break;
                    case 5:
                        Computer_Science_Engineering_V();
                        break;
                    case 6:
                        Computer_Science_Engineering_VI();
                        break;
                    case 7:
                        Computer_Science_Engineering_VII();
                        break;
                    case 8:
                        Computer_Science_Engineering_VIII();
                        break;
                }
                break;
            case 8:
                switch (sem) {
                    case 3:
                        Electrical_Electronics_Engineering_III();
                        break;
                    case 4:
                        Electrical_Electronics_Engineering_IV();
                        break;
                    case 5:
                        Electrical_Electronics_Engineering_V();
                        break;
                    case 6:
                        Electrical_Electronics_Engineering_VI();
                        break;
                    case 7:
                        Electrical_Electronics_Engineering_VII();
                        break;
                    case 8:
                        Electrical_Electronics_Engineering_VIII();
                        break;
                }
                break;
            case 9:
                switch (sem) {
                    case 3:
                        Electronics_Communication_Engineering_III();
                        break;
                    case 4:
                        Electronics_Communication_Engineering_IV();
                        break;
                    case 5:
                        Electronics_Communication_Engineering_V();
                        break;
                    case 6:
                        Electronics_Communication_Engineering_VI();
                        break;
                    case 7:
                        Electronics_Communication_Engineering_VII();
                        break;
                    case 8:
                        Electronics_Communication_Engineering_VIII();
                        break;
                }
                break;
            case 10:
                switch (sem) {
                    case 3:
                        Electronics_Instrumentation_Engineering_III();
                        break;
                    case 4:
                        Electronics_Instrumentation_Engineering_IV();
                        break;
                    case 5:
                        Electronics_Instrumentation_Engineering_V();
                        break;
                    case 6:
                        Electronics_Instrumentation_Engineering_VI();
                        break;
                    case 7:
                        Electronics_Instrumentation_Engineering_VII();
                        break;
                    case 8:
                        Electronics_Instrumentation_Engineering_VIII();
                        break;
                }
                break;
            case 11:
                switch (sem) {
                    case 3:
                        Electronics_Telecommunication_Engineering_III();
                        break;
                    case 4:
                        Electronics_Telecommunication_Engineering_IV();
                        break;
                    case 5:
                        Electronics_Telecommunication_Engineering_V();
                        break;
                    case 6:
                        Electronics_Telecommunication_Engineering_VI();
                        break;
                    case 7:
                        Electronics_Telecommunication_Engineering_VII();
                        break;
                    case 8:
                        Electronics_Telecommunication_Engineering_VIII();
                        break;
                }
                break;
            case 12:
                switch (sem) {
                    case 3:
                        Industrial_Production_Engineering_III();
                        break;
                    case 4:
                        Industrial_Production_Engineering_IV();
                        break;
                    case 5:
                        Industrial_Production_Engineering_V();
                        break;
                    case 6:
                        Industrial_Production_Engineering_VI();
                        break;
                    case 7:
                        Industrial_Production_Engineering_VII();
                        break;
                    case 8:
                        Industrial_Production_Engineering_VIII();
                        break;
                }
                break;
            case 13:
                switch (sem) {
                    case 3:
                        Information_Science_Engineering_III();
                        break;
                    case 4:
                        Information_Science_Engineering_IV();
                        break;
                    case 5:
                        Information_Science_Engineering_V();
                        break;
                    case 6:
                        Information_Science_Engineering_VI();
                        break;
                    case 7:
                        Information_Science_Engineering_VII();
                        break;
                    case 8:
                        Information_Science_Engineering_VIII();
                        break;
                }
                break;
            case 14:
                switch (sem) {
                    case 3:
                        Manufacturing_Science_Engineering_III();
                        break;
                    case 4:
                        Manufacturing_Science_Engineering_IV();
                        break;
                    case 5:
                        Manufacturing_Science_Engineering_V();
                        break;
                    case 6:
                        Manufacturing_Science_Engineering_VI();
                        break;
                    case 7:
                        Manufacturing_Science_Engineering_VII();
                        break;
                    case 8:
                        Manufacturing_Science_Engineering_VIII();
                        break;
                }
                break;
            case 15:
                switch (sem) {
                    case 3:
                        Marine_Engineering_III();
                        break;
                    case 4:
                        Marine_Engineering_IV();
                        break;
                    case 5:
                        Marine_Engineering_V();
                        break;
                    case 6:
                        Marine_Engineering_VI();
                        break;
                    case 7:
                        Marine_Engineering_VII();
                        break;
                    case 8:
                        Marine_Engineering_VIII();
                        break;
                }
                break;
            case 16:
                switch (sem) {
                    case 3:
                        Mechanical_Engineering_III();
                        break;
                    case 4:
                        Mechanical_Engineering_IV();
                        break;
                    case 5:
                        Mechanical_Engineering_V();
                        break;
                    case 6:
                        Mechanical_Engineering_VI();
                        break;
                    case 7:
                        Mechanical_Engineering_VII();
                        break;
                    case 8:
                        Mechanical_Engineering_VIII();
                        break;
                }
                break;
            case 17:
                switch (sem) {
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        Mechatronics();
                        break;
                }
                break;
            case 18:
                switch (sem) {
                    case 3:
                        Medical_Electronics_III();
                        break;
                    case 4:
                        Medical_Electronics_IV();
                        break;
                    case 5:
                        Medical_Electronics_V();
                        break;
                    case 6:
                        Medical_Electronics_VI();
                        break;
                    case 7:
                        Medical_Electronics_VII();
                        break;
                    case 8:
                        Medical_Electronics_VIII();
                        break;
                }
                break;
            case 19:
                switch (sem) {
                    case 3:
                        Mining_Engineering_III();
                        break;
                    case 4:
                        Mining_Engineering_IV();
                        break;
                    case 5:
                        Mining_Engineering_V();
                        break;
                    case 6:
                        Mining_Engineering_VI();
                        break;
                    case 7:
                        Mining_Engineering_VII();
                        break;
                    case 8:
                        Mining_Engineering_VIII();
                        break;
                }
                break;
            case 20:
                switch (sem) {
                    case 3:
                        Nano_Technology_III();
                        break;
                    case 4:
                        Nano_Technology_IV();
                        break;
                    case 5:
                        Nano_Technology_V();
                        break;
                    case 6:
                        Nano_Technology_VI();
                        break;
                    case 7:
                        Nano_Technology_VII();
                        break;
                    case 8:
                        Nano_Technology_VIII();
                        break;
                }
                break;
            case 21:
                switch (sem) {
                    case 3:
                        Petrochem_Engineering_III();
                        break;
                    case 4:
                        Petrochem_Engineering_IV();
                        break;
                    case 5:
                        Petrochem_Engineering_V();
                        break;
                    case 6:
                        Petrochem_Engineering_VI();
                        break;
                    case 7:
                        Petrochem_Engineering_VII();
                        break;
                    case 8:
                        Petrochem_Engineering_VIII();
                        break;
                }
                break;
        }
    }

    private void First_Year2021() {
        subjectArr = new String[]{"Calculus & Differential Equations", "Engineering Physics", "Basic Electrical Engineering", "Elements Of Civil Engineering And Mechanics", "Engineering Visualization", "Engineering Physics Laboratory", "Basic Electrical Engineering Laboratory", "Communicative English", "Innovation and Design Thinking", "Advanced Calculus And Numerical Methods", "Engineering Chemistry", "Problem-Solving through Programming", "Basic Electronics & Communication Engineering", "Elements Of Mechanical Engineering", "Engineering Chemistry Laboratory", "Computer Programming Laboratory", "Professional Writing Skills in English", "Scientific Foundations of Health"};
    }

    private void First_Year() {
        subjectArr = new String[]{"Advance Calculus And Numerical Methods", "Basic Electrical Engineering", "Basic Electrical Lab", "Basic Electronics", "C Programming For Problem Solving",
                "C Programming Lab", "Calculus And Linear Algebra", "Elements Of Civil Engineering And Mechanics", "Elements Of Mechanical Engineering", "Engineering Chemistry Lab", "Engineering Chemistry",
                "Engineering Graphics", "Engineering Physics Lab", "Engineering Physics", "Technical English I", "Technical English II"};
    }

    private void Aeronautical_Engineering_III2021() {
        subjectArr = new String[]{"Mathematics Course", "Aircraft Materials and Processes(+Manufacturing Process Lab)", "Fluid Mechanics (+Fluid Mechanics Lab)", "Elements of Aeronautics (EoA)", "CAAD (Computer Aided Aircraft Drawing)", "Social Connect and Responsibility", "Kannada", "Ability Enhancement Course - III"};
    }


    private void Aeronautical_Engineering_III() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – I", "Aadalitha Kannada", "Aero Thermodynamics", "CONSTITUTION OF INDIA, PROFESSIONAL ETHICS AND CYBER LAW (CPC)", "Elements of Aeronautics",
                "MACHINE SHOP LAB", "MATERIAL TESTING LAB", "MEASUREMENTS AND METROLOGY LAB", "Measurement and Metrology", "Mechanics of Fluids", "Mechanics of Materials",
                "TRANSFORM CALCULUS, FOURIER SERIES AND NUMERICAL TECHNIQUES", "Vyavaharika Kannada"};

    }

    private void Aeronautical_Engineering_IV2021() {
        subjectArr = new String[]{"MATHEMATICS IV", "Aerodynamics (+ Aerodynamics lab)", "Mechanics of Materials", "Biology For Engineers", "Hydraulics and Pneumatics Systems Lab", "Kannada", "Ability Enhancement Course- IV", "Universal Human Values", "Inter/Intra Institutional Internship"};
    }

    private void Aeronautical_Engineering_IV() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – II", "Aerodynamics-I", "Aircraft Material Science",
                "Aircraft Propulsion", "COMPLEX ANALYSIS, PROBABILITY AND STATISTICAL METHODS", "COMPUTER AIDED AIRCRAFT DRAWING",
                "MATERIAL TESTING LAB", "MEASUREMENTS AND METROLOGY LAB", "Mechanisms and Machine Theory", "Turbomachines"};
    }

    private void Aeronautical_Engineering_V2021() {
        subjectArr = new String[]{"Mechanism and Machine Theory", "Aircraft Propulsion (Propulsion Lab)", "Aero structures", "Aircraft Performance and Stability", "Advanced Aircraft Structures Lab", "Research Methodology Intellectual Property Rights", "Environmental Studies", "Ability Enhancement Course-V"};
    }

    private void Aeronautical_Engineering_V() {
        subjectArr = new String[]{"AERODYNAMICS - II", "AERODYNAMICS LAB", "AIRCRAFT STRUCTURES - I",
                "AIRCRAFT SYSTEMS & INSTRUMENTATION", "ENERGY CONVERSION AND FLUID MECHANICS LAB",
                "ENVIRONMENTAL STUDIES", "INTRODUCTION TO COMPOSITE MATERIALS", "MANAGEMENT AND ENTREPRENEURSHIP",
                "THEORY OF VIBRATIONS"};
    }

    private void Aeronautical_Engineering_VI2021() {
        subjectArr = new String[]{"Aviation Management", "Aircraft Systems and Avionics", "Gas Turbine Technology",
                "Flight Vehicle Design", "Computational Fluid Flow and Heat Transfer", "Composite Materials and Structures",
                "Principles of Flight Simulation", "Introduction to Aerospace History", " Indian Aviation",
                " Introduction to Helicopters", "Airline and Airport Management",
                "Flight Modelling, Analysis and Simulation Lab", "Mini Project", "Innovation/Entrepreneurship/Societal Internship"};
    }

    private void Aeronautical_Engineering_VI() {
        subjectArr = new String[]{"AIRCRAFT PERFORMANCE", "AIRCRAFT PROPULSION LAB", "AIRCRAFT STRUCTURES - II",
                "AIRCRAFT STRUCTURES LAB", "AIRCRAFT TRANSPORTATION SYSTEMS", "ARTIFICIAL INTELLIGENCE& EXPERT SYSTEMS",
                "BASICS OF ROCKETS & MISSILES", "ELEMENTS OF JET PROPULSION SYSTEMS", "FINITE ELEMENT METHOD",
                "GAS TURBINE TECHNOLOGY", "HISTORY OF FLIGHT & TECHNOLOGY FORECAST", "NUMERICAL METHODS"};
    }

    private void Aeronautical_Engineering_VII2021() {
        subjectArr = new String[]{"Conjugate Heat Transfer(CHT)", "Control Engineering", "Wind Tunnel Techniques", "Heat and Mass Transfer",
                "Helicopter Dynamics", "AI and ML for Aerospace Applications", "Flight Testing", "Space Mechanics", "Theory of Aircraft Vibrations",
                "Aircraft Maintenance, Repair and Overhaul", "Computational Science & Engineering", "System Engineering",
                " Earth and Space Science ", "Industrial Aerodynamics", "Aviation and Internet Infrastructure",
                "Space Mechanics", "Theory of Aircraft Vibrations", "Aircraft Maintenance, Repair and Overhaul ", "Computational Science & Engineering", "System Engineering", "Project work"};
    }

    private void Aeronautical_Engineering_VII() {
        subjectArr = new String[]{"AIRCRAFT STABILITY AND CONTROL", "COMPUTATIONAL FLUID DYNAMICS", "CONTROL ENGINEERING",
                "FATIGUE AND FRACTURE MECHANICS", "FLIGHT SIMULATION LAB", "FUNDAMENTALS OF AERODYNAMIC THEORY", "GUIDANCE, NAVIGATION & CONTROL",
                "HEAT & MASS TRANSFER", "HIGH PERFORMANCE COMPUNTING", "HYDRAULICS & PNEUMATICS", "MAINTENANCE, OVERHAUL & REPAIR OF AIRCRAFT SYSTEMS",
                "MODELING & ANALYSIS LAB", "OPERATIONS RESEARCH", "UNMANNED AERIAL VEHICLES", "WIND TUNNEL TECHNIQUES"};
    }

    private void common_VIII2021() {
        subjectArr = new String[]{"Technical Seminar", "Research Internship/ Industry Internship", "National Service Scheme (NSS), physical education, yoga"};
    }

    private void Aeronautical_Engineering_VIII() {
        subjectArr = new String[]{"A VIONICS", "BOUNDARY LAYER THEORY", "FLIGHT TESTING", "FLIGHT VEHICLE DESIGN",
                "HELICOPTER DYNAMICS"};
    }

    private void Aerospace_Engineering_III2021() {
        subjectArr = new String[]{"Mathematics Course", "Aerospace Materials and Processes(+ Manufacturing Process Lab)", "Fluid Mechanics (+ Fluid Mechanics Lab)", "Introduction to Aerospace Engineering (IAE)", "CAAD (Computer Aided Aircraft Drawing)", "Social Connect and Responsibility", "kannada", "Ability Enhancement Course - III"};
    }

    private void Aerospace_Engineering_III() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – I", "AEROSPACE MATERIALS", "Aadalitha Kannada", "Aero Thermodynamics",
                "CONSTITUTION OF INDIA, PROFESSIONAL ETHICS AND CYBER LAW (CPC)", "INTRODUCTION TO AEROSPACE ENGINEERING",
                "MATERIAL TESTING LAB", "MEASUREMENTS AND METROLOGY LAB", "Mechanics of Fluids", "Mechanics of Materials",
                "SATELLITE COMMUNICATION", "TRANSFORM CALCULUS, FOURIER SERIES AND NUMERICAL TECHNIQUES", "Vyavaharika Kannada"};
    }

    private void Aerospace_Engineering_IV2021() {
        subjectArr = new String[]{"MATHEMATICS IV", "Aerodynamics (+ Aerodynamics lab) ", "Aero Engineering Thermodynamics ( + Energy Conversion+ Heat & Mass Transfer Labs)", "Mechanics of Materials", "Biology For Engineers", "Propulsion Lab ", "Kannada/Constitution of India"};
    }

    private void Aerospace_Engineering_IV() {
        subjectArr = new String[]{"AEROSPACE STRUCTURES – I", "Aerodynamics-I", "COMPLEX ANALYSIS, PROBABILITY AND STATISTICAL METHODS",
                "COMPOSITE MATERIALS", "COMPUTER AIDED AIRCRAFT DRAWING", "ENERGY CONVERSION AND FLUID MECHANICS LAB", "INTRODUCTION TO SPACE TECHNOLOGY",
                "Mechanisms and Machine Theory"};
    }

    private void Aerospace_Engineering_V2021() {
        subjectArr = new String[]{"Mechanism and Machine Theory", "Aerospace Propulsion (+ Advanced Propulsion Lab)", "Aerospace structures", "Aircraft Performance and Stability", "Aerospace Structures Lab", "Research Methodology & Intellectual Property Rights", "Environmental Studies ", "Ability Enhancement Course-V"};
    }

    private void Aerospace_Engineering_V() {
        subjectArr = new String[]{"AERODYNAMICS - II", "AERODYNAMICS LAB", "AEROSPACE PROPULSION", "AEROSPACE STRUCTURES - II",
                "AIRCRAFT SYSTEMS & INSTRUMENTATION", "ENVIRONMENTAL STUDIES SECONDARY", "ENVIRONMENTAL STUDIES", "FLIGHT MECHANICS",
                "MANAGEMENT AND ENTREPRENEURSHIP", "PROPULSION LAB"};
    }

    private void Aerospace_Engineering_VI2021() {
        subjectArr = new String[]{"Aviation Management ", "Aircraft Systems and Avionics ( + Avionics Lab)", "Rockets and Missiles",
                "Introduction to Astrophysics and Space Environment", "Theory of Vibrations", "Radar and Microwave Engineering",
                "Gas Turbine Technology and Space propulsion", "Introduction to Aerospace History", "Indian Aviation",
                "Introduction to Helicopters", "Flight Modelling, Analysis and Simulation Lab",
                "Mini Project", "Innovation/Entrepreneurship /Societal Internship"};
    }

    private void Aerospace_Engineering_VI() {
        subjectArr = new String[]{"AIRCRAFT STRUCTURES LAB", "BASICS OF ROCKETS & MISSILES", "COMPUTATIONAL FLUID DYNAMICS",
                "DESIGN, MODELLING & ANALYSIS LAB", "ELEMENTS OF JET PROPULSION SYSTEMS", "FINITE ELEMENT METHOD", "HISTORY OF FLIGHT & TECHNOLOGY FORECAST",
                "HYPERSONICS", "INTRODUCTION TO ASTROPHYSICS AND SPACE ENVIRONMENT", "MISSILES AND LAUNCH VEHICLES", "RADAR AND MICROWAVE ENGINEERING", "THEORY OF VIBRATIONS"};
    }

    private void Aerospace_Engineering_VII2021() {
        subjectArr = new String[]{"Conjugate Heat Transfer(CHT)", "Global Navigation Satellite Systems", "Wind Tunnel Techniques", "Control Engineering",
                "Cryogenics", "AI and ML for Aerospace Applications", "Flight Testing",
                "Space Mechanics", "Guidance, Navigation & Control", "Space Vehicle Design ", "Satellite Design and Systems",
                "Satellite Communication", "Earth and Space Sciences", "Industrial Aerodynamics", "Aviation and Internet Infrastructure", "Project work"};
    }

    private void Aerospace_Engineering_VII() {
        subjectArr = new String[]{"AVIONICS AND INSTRUMENTATION LAB", "AVIONICS SYSTEMS", "Air And Missile Defence Systems",
                "CONTROL ENGINEERING", "FUNDAMENTALS OF AERODYNAMIC THEORY", "GLOBAL NAVIGATION SATELLITE SYSTEMS", "GUIDANCE, NAVIGATION & CONTROL",
                "HEAT & MASS TRANSFER", "MAINTENANCE, OVERHAUL & REPAIR OF AIRCRAFT SYSTEMS", "SPACE MECHANICS", "SPACE SIMULATION LAB",
                "SPACE VEHICLE DESIGN", "UNMANNED AERIAL VEHICLES", "WIND TUNNEL TECHNIQUES"};
    }

    private void Aerospace_Engineering_VIII() {
        subjectArr = new String[]{"CRYOGENICS", "OPTIMIZATION TECHNIQUES", "ROBOTICS", "SATELLITE NAVIGATION SYSTEMS", "SPACECRAFT SYSTEMS"};
    }


    private void Architecture_I2021() {
        subjectArr = new String[]{"Architectural Design-I", "Materials & Methods in Building Construction-I", "Architectural Graphics-I ", "14 History of Architecture-I ", "Basic Design & Visual Arts A", "Model Making Workshop ", "Innovation and Design Thinking", "Communicative English"};
    }

    private void Architecture_I() {
        subjectArr = new String[]{"ARCHITECTURAL DESIGN -I", "ARCHITECTURAL GRAPHICS-I", "BASIC DESIGN & VISUAL ARTS",
                "BUILDING STRUCTURES-I", "COMMUNICATION SKILLS", "HISTORY OF ARCHITECTURE - I", "MATERIALS AND METHODS IN BUILDING CONSTRUCTION-I",
                "MODEL MAKING WORKSHOP"};
    }

    private void Architecture_II2021() {
        subjectArr = new String[]{"Architectural Design- II", "C22 Materials and Methods in Building Construction-II", "3 Architectural Graphics-II", "4 History of Architecture-II", "Basic Design & Theory of Design", "Building Structure -I", "Site Surveying and Analysis", "Professional Writing Skills in English", " Scientific Foundatioins of Health"};
    }

    private void Architecture_II() {
        subjectArr = new String[]{"ARCHITECTURAL DESIGN -II", "ARCHITECTURAL GRAPHICS-II", "BASIC DESIGN & ART APPRECIATION",
                "BUILDING STRUCTURES-II", "HISTORY OF ARCHITECTURE - II", "KANNADA BHASHE - Aadalitha Matthu Vyavahara", "MATERIALS AND METHODS IN BUILDING CONSTRUCTION-II",
                "SITE SURVEYING & ANALYSIS", "Vyavaharika Kannada"};
    }

    private void Architecture_III2021() {
        subjectArr = new String[]{"Architectural Design -III", "Materials and Methods in Building Construction -III",
                "Climatology", "34 History of Architecture -III ", "Building Services -I", "Building Structure -II ",
                "Kannada", "Architectural Photography", "Vernacular Architecture", "Social Connect & Responsibility"};
    }

    private void Architecture_III() {
        subjectArr = new String[]{"ARCHITECTURAL DESIGN-III", "BUILDING STRUCTURES – III", "CLIMATOLOGY", "COMPUTER APPLICATIONS IN ARCHITECTURE -I",
                "ELECTIVE", "HISTORY OF ARCHITECTURE – III", "MATERIALS AND METHODS IN BUILDING CONSTRUCTION-III", "THEORY OF ARCHITECTURE-I"};
    }

    private void Architecture_IV2021() {
        subjectArr = new String[]{"1 Architectural Design -IV ", "Materials and Methods in Building Construction -IV",
                "History of Architecture -IV", "Building Services -II", "C45 Building Structure -III",
                "Constitution of India &  Constitution of India & Professional Ethics ",
                "Computer Application in Architecture -I", "Environment Responsive Architecture", "Product Design",
                "Universal Human Values and Professional Ethics"};
    }

    private void Architecture_IV() {
        subjectArr = new String[]{"ARCHITECTURAL DESIGN - IV", "BUILDING SERVICES – I (Water Supply and Sanitation)", "BUILDING STRUCTURES – IV",
                "COMPUTER APPLICATIONS IN ARCHITECTURE – II", "ELECTIVE II", "HISTORY OF ARCHITECTURE-IV", "MATERIALS AND METHODS IN BUILDING CONSTRUCTION-IV",
                "THEORY OF ARCHITECTURE -II"};
    }

    private void Architecture_V2021() {
        subjectArr = new String[]{"Architectural Design -V", "Materials and Methods in Building Construction -V",
                "History of Architecture-V", "Sociology & Building Economics", "Building Services -III",
                "Building Structure -IV", "Building Information Modelling", "Alternative Building technology & Materials", "Digital Architecture",
                "Physical Education(Sport & Athletics/Yoga & NSS"};
    }

    private void Architecture_V() {
        subjectArr = new String[]{"ARCHITECTURAL DESIGN -V", "BUILDING SERVICES-II (Electrical Services and Illumination)", "BUILDING STRUCTURES - V",
                "ELECTIVE -V", "ELECTIVE III", "HISTORY OF ARCHITECTURE - V", "MATERIALS AND METHODS IN BUILDING CONSTRUCTION – V",
                "SOCIOLOGY AND BUILDING ECONOMICS", "WORKING DRAWING -I"};
    }

    private void Architecture_VI2021() {
        subjectArr = new String[]{"Architectural Design -V", "Materials and Methods in Building Construction -VI",
                "Landscape Architecture", "Building Services -IV Accoustics&Noise Control", "Building Structure -V",
                "Working Drawing-I", "Culture & Built Environment", "Design of Highrise Buildings", "Study Tour", "Physical Education(Sport & Atheltics0/Yoga & NSS"};
    }

    private void Architecture_VI() {
        subjectArr = new String[]{"ARCHITECTURAL DESIGN - VI", "BUILDING SERVICES - III", "BUILDING STRUCTURES - VI",
                "CONTEMPORARY ARCHITECTURE", "ELECTIVE I", "LANDSCAPE ARCHITECTURE", "MATERIALS AND METHODS IN BUILDING CONSTRUCTION–VI",
                "STUDY TOUR", "WORKING DRAWING II"};
    }

    private void Architecture_VII2021() {
        subjectArr = new String[]{"Architectural Design -VII", "Materials and Methods in Building Construction -VII",
                "Urban Design", "Professional Practice", "Estimation & Costing", "Interior Design", "Working Drawing-II",
                "Craft in Architecture", "Architectural writings & Journalism", "Traffic Awareness & Road Safety"};
    }

    private void Architecture_VII() {
        subjectArr = new String[]{"ARCHITECTURAL DESIGN - VII", "BUILDING SERVICES – IV(ACOUSTICS AND NOISE CONTROL)",
                "INTERIOR DESIGN", "MATERIALS AND METHODS IN BUILDING CONSTRUCTION VII", "SPECIFICATION, QUANTITY AND COSTING OF BUILDINGS",
                "URBAN DESIGN"};
    }

    private void Architecture_VIII2021() {
        subjectArr = new String[]{"Professional Training*"};
    }

    private void Architecture_VIII() {
        subjectArr = new String[]{"PROFESSIONAL TRAINING", "ARCHITECTURAL DESIGN - VIII (ARCHITECTURE IN URBAN CONTEXT)",
                "ARCHITECTURAL DESIGN PROJECT(Thesis)", "CONSTITUTIONAL LAW", "CONSTRUCTION AND PROJECT MANAGEMENT", "ELECTIVE -VI",
                "MATERIALS AND METHODS IN BUILDING CONSTRUCTION VIII", "PROFESSIONAL PRACTICE", "PROFESSIONAL TRAINING", "THESIS SEMINAR",
                "URBAN PLANNING"};
    }

    private void Biomedical_Engineering_III2021() {
        subjectArr = new String[]{"Transform Calculus, Fourier Series and Numerical Techniques", "Analog Electronic Circuits",
                "Digital Design and HDL", "Instrumentation, Measurements and Biomedical Transducers", "Measurement and Biomedical Transducers Lab",
                "Social Connect and Responsibility", "Kannada/Constitution", "Ability Enhancement Course - III"};
    }


    private void Biomedical_Engineering_III() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – I", "Aadalitha Kannada", "Analog Electronic Circuits Lab",
                "Analog Electronic Circuits", "CONSTITUTION OF INDIA, PROFESSIONAL ETHICS AND CYBER LAW (CPC)", "Digital Design and HDL Lab",
                "Digital Design and HDL", "Electronic Instrumentation and Measurements", "Human Anatomy and Physiology",
                "Network Analysis", "TRANSFORM CALCULUS, FOURIER SERIES AND NUMERICAL TECHNIQUES", "Vyavaharika Kannada"};
    }

    private void Biomedical_Engineering_IV2021() {
        subjectArr = new String[]{"Complex Analysis, Probability and Statistical Methods", "Embedded Controllers", "Java Programming", "Signal Conditioning and Data Acquisition Circuits",
                "Biology For Engineers", "Signal Conditioning and Data Acquisition Circuits Lab", "Kannada/Constitution", "Ability Enhancement Course- IV", "Universal Human Values", "Universal Human Values",
                "Inter/Intra Institutional Internship"};
    }

    private void Biomedical_Engineering_IV() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – II", "Biomedical Transducers and Instrumentation", "Biomedical Transducers and Measurements Lab",
                "COMPLEX ANALYSIS, PROBABILITY AND STATISTICAL METHODS", "Control Systems", "Embedded Controllers Lab", "Embedded Controllers",
                "Scientific and Analytical Instrumentation", "Signal Conditioning and Data Acquisition Circuits"};
    }

    private void Biomedical_Engineering_V2021() {
        subjectArr = new String[]{"Clinical Instrumentation", "Fundamentals of Signals & DSP", "Rehabilitation Engineering", "Biomedical Equipment’s",
                "Clinical Instrumentation Lab", "Research Methodology & Intellectual Property Rights", "Environmental Studies", "Ability Enhancement Course-V"};
    }

    private void Biomedical_Engineering_V() {
        subjectArr = new String[]{"Biomedical Equipment", "Clinical Instrumentation and Signal Processing Lab", "Clinical Instrumentation",
                "ENVIRONMENTAL STUDIES", "Fundamentals of Signals and DSP", "Rehabilitation Engineering", "Signal Conditioning Circuits and Data Acquisition Lab",
                "Technological Innovation Management and Entrepreneurship", "VLSI Design"};
    }

    private void Biomedical_Engineering_VI2021() {
        subjectArr = new String[]{"Technological Innovation Management & Entrepreneurship", "Medical Image Processing", "Biomedical Digital Signal Processing",
                "Scientific and Analytical Instrumentation", "Medical Device Regulations and Safety",
                "Analog and Digital Communication Systems", "Virtual Bio-Instrumentation", "Hospital Design, Planning and Management",
                "Biomedical Transducers and Medical Instrumentation ", "Biomedical DSP Lab",
                "Mini Project", "Innovation/Entrepreneurship /Societal Internship"};
    }

    private void Biomedical_Engineering_VI() {
        subjectArr = new String[]{"Advanced Clinical Instrumentation", "Analog and Digital Communication Systems",
                "Biomedical Transducers and Instrumentation", "Hospital Design, Planning and Management",
                "Internship", "JAVA Programming Lab", "JAVA Programming", "Medical Device Regulations and Safety",
                "Medical Image Processing Lab", "Medical Image Processing", "Medical Imaging Systems", "Mini Project",
                "Rehabilitation Engineering", "Virtual Bio-Instrumentation"};
    }

    private void Biomedical_Engineering_VII2021() {
        subjectArr = new String[]{"Medical Imaging Systems", "Biomaterials and Artificial organs",
                "Database Management System in Healthcare", "Bio-MEMS", "ARM Processor", "Ergonomics",
                "Biomechanics and Biodynamics ", "Biostatistics ", "Advanced Clinical Instrumentation",
                "Biomedical Signal Processing", "Medical Informatics", "Project Work"};
    }

    private void Biomedical_Engineering_VII() {
        subjectArr = new String[]{"ARM Processor Lab", "ARM Processor", "Biomechanics and Biodynamics", "Biomedical DSP Lab",
                "Biomedical Digital Signal Processing", "Biomedical Digital Signal Processing", "Biometric Systems",
                "Biostatistics", "Database Management System in Healthcare", "Ergonomics", "Internet of Things", "Internship",
                "Lasers and Optical Fibers in Medicine", "Medical Image Processing", "Medical Informatics and Expert Systems Secondary",
                "Medical Informatics and Expert Systems", "Project Work Phase-1"};
    }


    private void Biomedical_Engineering_VIII() {
        subjectArr = new String[]{"Artificial Intelligence and Machine Learning", "Bio-MEMS", "Biomaterials and Artificial Organs",
                "Computer Communication Networks in Healthcare", "Internship", "Medical Imaging Systems", "Project Work Phase-2",
                "Technical Seminar"};
    }

    private void Biotechnology_III2021() {
        subjectArr = new String[]{"Mathematics course", "Unit operations + lab", "Biochemistry + lab", "Microbiology", "Microbiology lab", "Social Connect and Responsibility", "Kannada", "Ability Enhancement Course - III"};

    }


    private void Biotechnology_III() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – I", "Aadalitha Kannada", "BIOSTATISTICS", "CELL BIOLOGY AND GENETICS",
                "CONSTITUTION OF INDIA, PROFESSIONAL ETHICS AND CYBER LAW (CPC)", "INTRODUCTION TO BIOMOLECULES", "MICROBIOLOGY LABORATORY",
                "MICROBIOLOGY", "PYTHON PROGRAMMING", "UNIT OPERATIONS LABORATORY", "UNIT OPERATIONS", "Vyavaharika Kannada"};
    }

    private void Biotechnology_IV2021() {
        subjectArr = new String[]{"Biostatistics and Design of experiments", "Python programming + lab", "Cell biology &Cell culture techniques + lab", "Molecular biology &Genetic engineering", "Biology for engineers", "Molecular biology &Genetic engineering lab", "Kannada", "Ability Enhancement Course- IV", "Universal Human Values", "Inter/Intra Institutional Internship"};
    }

    private void Biotechnology_IV() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – II", "BIOCHEMICAL THERMODYNAMICS", "BIOCHEMISTRY LABORATORY",
                "CELL CULTURE TECHNIQUES", "CLINICAL BIOCHEMISTRY", "IMMUNOTECHNOLOGY LABORATORY", "IMMUNOTECHNOLOGY", "MOLECULAR BIOLOGY",
                "STOICHIOMETRY"};
    }

    private void Biotechnology_V2021() {
        subjectArr = new String[]{"Biokinetics &Bioreaction engineering", "Immunotechnology+lab", "Structural biology &Analytical techniques", "Genomics, Proteomics &Bioinformatics", "Bioinformatics lab", "Research methodology & Intellectual property rights", "Environmental Studies Ability Enhancement Course-V"};
    }

    private void Biotechnology_V() {
        subjectArr = new String[]{"BIO-BUSINESS AND ENTREPRENEURSHIP", "BIOANALYTICAL TECHNIQUES", "BIOKINETICS& ENZYME TECHNOLOGY LABORATORY",
                "CHEMICAL REACTION ENGINEERING", "ENVIRONMENTAL STUDIES", "ENZYME TECHNOLOGY & BIOTRANSFORMATION", "GENETIC ENGINEERING & APPLICATIONS",
                "GENETIC ENGINEERING AND CELL CULTURE LABORATORY", "GENOMICS AND PROTEOMICS"};
    }

    private void Biotechnology_VI2021() {
        subjectArr = new String[]{"Biobusiness Management and Entrepreneurship", "Bioprocess Principles, Control &Automation + Lab",
                "Enzyme Technology", "Human Anatomy and Physiology", "Biological Data Management and Analysis", "Biochemical Thermodynamics and Bioenergetics ",
                "Ecology and Ecosystem", "Forensic Science", "Enzyme Technology lab",
                "Mini-project", "Innovation/Entrepreneurship /Societal Internship"};

    }

    private void Biotechnology_VI() {
        subjectArr = new String[]{"BIOINFORMA TICS", "BIOINFORMATICS LABORATORY", "BIOLOGY FOR ENGINEERS", "BIOMA TERIALS",
                "BIOPROCESS EQUIPMENT DESIGN & CAED", "BIOTECHNOLOGY", "FOOD PROCESS ENGINEERING", "HUMAN PHYSIOLOGY", "NANOBIOTECHNOLOGY",
                "PHYTO-CHEMISTRY AND PHYTO-HARMONES", "PROCESS CONTROL & AUTOMATION LABORATORY", "PROCESS CONTROL & AUTOMATION"};
    }

    private void Biotechnology_VII2021() {
        subjectArr = new String[]{"Upstream &Downstream Bioprocess Technology", "Bioethics and Biosafety",
                "Medicinal Chemistry and Chemoinformatics", "Metabolic Engineering and Functional Genomics", "Bioreactor Design and Scale up ",
                "Systems Biology & Rational Drug Design", "Agricultural Biotechnology and Crop Improvement ", "Food Processing and Nutraceuticals",
                "Biomaterials and Medical Implants", "Biofuels and Bioenergy",
                "Project"};

    }

    private void Biotechnology_VII() {
        subjectArr = new String[]{"AGRICULTURAL BIOTECHNOLOGY", "BIOETHICS , BIOSAFETY & IPR", "BIOLOGICAL DATA MANAGEMENT",
                "BIOPROCESS ENGINEERING LABORATORY", "BIOPROCESS ENGINEERING", "BIOREACTOR DESIGN CONCEPTS", "BT FOR SUSTAINABLE ENVIRONMENT",
                "CLINICAL & PHARMACEUTICAL BIOTECHNOLOGY", "FORENSIC SCIENCE", "PROCESS EQUIPMENT& PLANT DESIGN", "TISSUE ENGINEERING",
                "TRANSPORT PHENOMENA"};
    }

    private void Biotechnology_VIII() {
        subjectArr = new String[]{"ENVIRONMENTAL BIOTECHNOLOGY", "INDUSTRIAL MICROBIOLOGY", "MARINE BIOTECHNOLOGY", "REGULATORY AFFAIRS IN BIOTECH INDUSTRY"};
    }

    private void Chemical_Engineering_III2021() {
        subjectArr = new String[]{"Transform Calculus, Fourier Series and Numerical Techniques", "Momentum Transfer", "Mechanical Operations", "Chemical Process Calculations",
                "Technical Chemistry Lab.", "Social Connect and Responsibility", "Kannada/Constitution", "Ability Enhancement Course - III"};
    }


    private void Chemical_Engineering_III() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – I", "Aadalitha Kannada", "CHEMICAL PROCESS CALCULATIONS", "CHEMICAL TECHNOLOGY-I",
                "CONSTITUTION OF INDIA, PROFESSIONAL ETHICS AND CYBER LAW (CPC)", "MECHANICAL OPERATIONS", "MOMENTUM TRANSFER LAB",
                "MOMENTUM TRANSFER", "TECHNICAL CHEMISTRY LAB", "TECHNICAL CHEMISTRY", "TRANSFORM CALCULUS, FOURIER SERIES AND NUMERICAL TECHNIQUES",
                "Vyavaharika Kannada"};
    }

    private void Chemical_Engineering_IV2021() {
        subjectArr = new String[]{"Complex Analysis, Probability and Statistical Methods", "Process Heat Transfer", "Industrial Pollution and Control", "Mass Transfer Operations", "Biology For Engineers",
                "Computer Aided Drawing Lab.", "Kannada/Constitution", "Ability Enhancement Course- IV", "Universal Human Values", "Inter/Intra Institutional Internship"};
    }

    private void Chemical_Engineering_IV() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – II", "CHEMICAL ENGINEERING DRAWING LAB", "CHEMICAL ENGINEERING THERMODYNAMICS",
                "CHEMICAL TECHNOLOGY-II", "COMPLEX ANALYSIS, PROBABILITY AND STATISTICAL METHODS", "INSTRUMENTAL ANALYSIS", "MATERIAL SCIENCE",
                "MECHANICAL OPEARATIONS LAB", "PROCESS HEAT TRANSFER"};
    }

    private void Chemical_Engineering_V2021() {
        subjectArr = new String[]{"Chemical Engineering Thermodynamics", "Separation Processes", "Chemical Process Industries", "Chemical Reaction Engineering Lab",
                "Research Methodology & Intellectual Property Rights", "Environmental Studies", "Ability Enhancement Course-V"};
    }

    private void Chemical_Engineering_V() {
        subjectArr = new String[]{"BIOCHEMICAL ENGINEERING", "CHEMICAL EQUIPMENT DESIGN", "CHEMICAL REACTION ENGINEERING-I",
                "ENVIRONMENTAL STUDIES", "HEAT TRANSFER LAB", "INDUSTRIAL POLLUTION CONTROL", "MANAGEMENT AND ENTREPRENEURSHIP",
                "MASS TRANSFER OPERATIONS-I", "POLLUTION CONTROL & INSTRUMENTAL ANALYSIS LAB"};
    }

    private void Chemical_Engineering_VI2021() {
        subjectArr = new String[]{"Process Engineering Economics and Management", "Process Control & IIoT (Industrial Iot)",
                "Computer Applications & Modeling", "Material Science and Engineering", "Petroleum Refinery Engineering",
                "Chemical Equipment Design", "Industrial Pollution and Control", "Solid Waste Management in Process Industries",
                "Computer Application & Simulation Lab",
                "Mini Project", "Innovation/Entrepreneurship/Societal Internship"};
    }

    private void Chemical_Engineering_VI() {
        subjectArr = new String[]{"CHEMICAL PLANT UTILITIES AND SAFETY", "CHEMICAL REACTION ENGINEERING LAB", "CHEMICAL REACTION ENGINEERING-II",
                "MASS TRANSFER OPERATIONS LAB", "MASS TRANSFER OPERATIONS-II SECONDARY", "MASS TRANSFER OPERATIONS-II", "MINI-PROJECT",
                "OILS AND FATS TECHNOLOGY", "PETROLEUM REFINERY ENGINEERING", "PROCESS AIR POLLUTION & CONTROL", "PROCESS EQUIPMENT DESIGN AND DRAWING",
                "PROCESS WASTE WATER MANAGEMENT", "SOLID WASTE MANAGEMENT IN PROCESS INDUSTRIES"};
    }

    private void Chemical_Engineering_VII2021() {
        subjectArr = new String[]{"Process Equipment Design & Drawing", "Biochemical Engineering",
                "Instrumental Methods of Analysis", "Novel Separation Techniques", "Oils and Fats Technology",
                "Chemical Process Integration", "Pilot Plant and Scale Up Studies", "Transport Phenomena",
                "Energy Technology", "Plant Utilities and Safety", "Project work"};
    }

    private void Chemical_Engineering_VII() {
        subjectArr = new String[]{"CHEMICAL PROCESS INTEGRATION", "COMPUTER APPLICATIONS & SIMULATION LAB", "COMPUTER APPLICATIONS AND MODELING",
                "ELECTRO CHEMICAL TECHNOLOGY", "FERMENTATION TECHNOLOGY", "FOOD TECHNOLOGY", "INTERNSHIP", "NOVEL SEPARATION TECHNIQUES",
                "PETROCHEMICAL ENGINEERING", "PETROCHEMICALS", "PILOT PLANT AND SCALE UP STUDIES", "PROCESS CONTROL AND INSTRUMENTATION",
                "PROCESS CONTROL LAB", "PROJECT WORK PHASE-1", "PULP AND PAPER TECHNOLOGY"};
    }

    private void Chemical_Engineering_VIII() {
        subjectArr = new String[]{"APPLIED MATHEMATICS IN CHEMICAL ENGINEERING SECONDARY", "APPLIED MATHEMATICS IN CHEMICAL ENGINEERING",
                "PROCESS ENGINEERING ECONOMICS AND MANAGEMENT SECONDARY", "PROCESS ENGINEERING ECONOMICS AND MANAGEMENT",
                "PROJECT WORK PHASE-2", "TECHNICAL SEMINAR INTERNSHIP"};
    }

    private void Civil_Engineering_III2021() {
        subjectArr = new String[]{"Transform Calculus, Fourier Series and Numerical Techniques", "Geodetic Engineering", "Strength of Materials", "Earth Resources and Engineering", "Computer Aided Building Planning and Drawing", "Social Connect and Responsibility", "Kannada", "Ability Enhancement Course - III"};

    }


    private void Civil_Engineering_III() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – I", "Aadalitha Kannada", "BASIC SURVEYING", "BUILDING MATERIALS AND CONSTRUCTION",
                "BUILDING MATERIALS TESTING LABORATORY", "CONSTITUTION OF INDIA, PROFESSIONAL ETHICS AND CYBER LAW (CPC)",
                "ENGINEERING GEOLOGY", "FLUIDS MECHANICS", "STRENGTH OF MATERIALS", "TRANSFORM CALCULUS, FOURIER SERIES AND NUMERICAL TECHNIQUES",
                "Vyavaharika Kannada"};
    }

    private void Civil_Engineering_IV2021() {
        subjectArr = new String[]{"Hydrology and Water Resources Engineering", "Transportation Engineering", "Design of RC Structural Elements", "Concrete Technology and Smart Materials", "Concrete Laboratory", "Research Methodology & Intellectual Property Rights", "Environmental Studies", "Ability Enhancement Course-V"};

    }

    private void Civil_Engineering_IV() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – II", "ADVANCED SURVEYING", "ANALYSIS OF DETERMINATE STRUCTURES",
                "APPLIED HYDRAULICS", "COMPLEX ANALYSIS, PROBABILITY AND STATISTICAL METHODS", "CONCRETE TECHNOLOGY",
                "ENGINEERING GEOLOGY LABORATORY", "FLUID MECHANICS AND HYDRAULIC MACHINES LABORATORY", "WATER SUPPLY AND TREATMENT ENGINEERING"};
    }

    private void Civil_Engineering_V2021() {
        subjectArr = new String[]{"Hydrology and Water Resources Engineering", "Transportation Engineering", "Design of RC Structural Elements", "Concrete Technology and Smart Materials", "Concrete Laboratory", "Research Methodology & Intellectual Property Rights", "Environmental Studies", "Ability Enhancement Course-V"};

    }

    private void Civil_Engineering_V() {
        subjectArr = new String[]{"ANALYSIS OF INDETERMINATE STRUCTURES", "BASIC GEOTECHNICAL ENGINEERING", "COMPUTER AIDED BUILDING PLANNING AND DRAWING",
                "CONCRETE AND HIGHWAY MATERIALS LABORATORY", "CONSTRUCTION MANAGEMENT AND ENTREPRENEURSHIP", "DESIGN OF RC STRUCTURAL ELEMENTS",
                "ENVIRONMENTAL STUDIES", "HIGHWAY ENGINEERING", "MUNICIPAL WASTEWATER ENGINEERING", "SURVEYING PRACTICE"};
    }

    private void Civil_Engineering_VI2021() {
        subjectArr = new String[]{"Construction Management and Entrepreneurship", "Geo Technical Engineering",
                "Design of Steel structure", "Design of Prestressed Concrete Structures", "Design Concept in Building Services", "Applied Geotechnical Engineering",
                "Remote Sensing and GIS ", "Occupational Health and Safety",
                "Computer Aided Detailing of Structure", "Mini Project", "Innovation/Entrepreneurship /Societal Internship"};

    }

    private void Civil_Engineering_VI() {
        subjectArr = new String[]{"ALTERNATE BUILDING MATERIALS", "APPLIED GEOTECHNICAL ENGINEERING", "DESIGN OF STEEL STRUCTURAL ELEMENTS",
                "ENVIRONMENTAL ENGINEERING LABORATORY", "EXTENSIVE SURVEY PROJECT", "GROUND IMPROVEMENT TECHNIQUES", "HYDROLOGY AND IRRIGATION ENGINEERING",
                "MATRIX METHOD OF STRUCTURAL ANALYSIS", "OCCUPATIONAL HEALTH AND SAFETY", "RAILWAYS, HARBOUR, TUNNELING AND AIRPORTS",
                "REMOTE SENSING AND GIS", "SOFTWARE APPLICATION LABORATORY", "SOLID WASTE MANAGEMENT", "SUSTAINABILITY CONCEPTS IN CIVIL ENGINEERING",
                "TRAFFIC ENGINEERING"};
    }

    private void Civil_Engineering_VII2021() {
        subjectArr = new String[]{"Quality Surveying And Contract Management", "Construction Technology for Substructure and Super Structures",
                "Advanced Design of RCC and Steel Structures", "Solid Waste Management", "Advanced Geotechnical Engineering",
                "Earthquake Engineering", "Air Pollution and Control", "Finite Element Method",
                "Project work"};

    }

    private void Civil_Engineering_VII() {
        subjectArr = new String[]{"AIR POLLUTION AND CONTROL", "COMPUTER AIDED DETAILING OF STRUCTURES", "DESIGN CONCEPT OF BUILDING SERVICES",
                "DESIGN OF HYDRAULIC STRUCTURES", "DESIGN OF RCC AND STEEL STRUCTURES", "EARTHQUAKE ENGINEERING", "ENVIRONMENTAL PROTECTION AND MANAGEMENT",
                "FINITE ELEMENT METHOD", "GEOTECHNICAL ENGINEERING LABORATORY", "GROUND WATER HYDRAULICS", "MASONRY STRUCTURES", "NUMERICAL METHODS AND APPLICATIONS",
                "PAVEMENT MATERIALS AND CONSTRUCTION", "QUANTITY SURVEYING AND CONTRACT MANAGEMENT", "REINFORCED EARTH STRUCTURES", "THEORY OF ELASTICITY",
                "URBAN TRANSPORT PLANNING"};
    }

    private void Civil_Engineering_VIII() {
        subjectArr = new String[]{"ADVANCED FOUNDATION ENGINEERING", "BRIDGE ENGINEERING", "DESIGN OF PRE-STRESSECONCRETE",
                "INTERNSHIP PROFESSIONAL PRACTICE", "PAVEMENT DESIGN", "PREFABRICATED STRUCTURES", "PROJECT WORK PHASE-2",
                "REHABILITATION AND RETROFITTING", "TECHNICAL SEMINAR"};
    }

    private void Computer_Science_Engineering_III2021() {
        subjectArr = new String[]{"Transform Calculus, Fourier Series And Numerical Techniques", "Data Structures and Applications", "Analog and Digital Electronics", "Computer Organization and Architecture", "Object Oriented Programming with JAVA Laboratory", "Social Connect and Responsibility", "Kannada", "Ability Enhancement Course - III"};

    }


    private void Computer_Science_Engineering_III() {
        subjectArr = new String[]{"ANALOG AND DIGITAL ELECTRONICS LABORATORY", "ANALOG AND DIGITAL ELECTRONICS",
                "COMPUTER ORGANIZATION", "DATA STRUCTURES AND APPLICATION", "DATA STRUCTURES LABORATORY",
                "DISCRETE MATHEMATICAL STRUCTURES", "SOFTWARE ENGINEERING"};
    }

    private void Computer_Science_Engineering_IV2021() {
        subjectArr = new String[]{"Mathematical Foundations for Computing", "Design and Analysis of Algorithms", "Operating Systems", "Biology For Engineers", "Python Programming Laboratory", "OR\n" +
                "Constitution of India & Professional Ethics", "Ability Enhancement Course- IV", "Universal Human Values", "Inter/Intra Institutional Internship"};

    }

    private void Computer_Science_Engineering_IV() {
        subjectArr = new String[]{"DATA COMMUNICATION", "DESIGN AND ANALYSIS OF ALGORITHMS LABORATORY",
                "DESIGN AND ANALYSIS OF ALGORITHMS", "MICROCONTROLLER AND EMBEDDED SYSTEMS LABORATORY",
                "MICROCONTROLLER AND EMBEDDED SYSTEMS", "OBJECT ORIENTED CONCEPTS", "OPERATING SYSTEMS"};
    }

    private void Computer_Science_Engineering_V2021() {
        subjectArr = new String[]{"Automata Theory and compiler Design", "Computer Networks", "Database Management Systems", "Artificial Intelligence and Machine Learning", "Database Management Systems Laboratory with Mini Project", "Research Methodology & Intellectual Property Rights", "Environmental Studies", "Ability Enhancement Course-V"};

    }

    private void Computer_Science_Engineering_V() {
        subjectArr = new String[]{"AUTOMATA THEORY AND COMPUTABILITY", "COMPUTER NETWORK LABORATORY",
                "COMPUTER NETWORKS", "DATABASE MANAGEMENT SYSTEM", "DBMS LABORATORY WITH MINI PROJECT",
                "MANAGEMENT AND ENTREPRENEURSHIP FOR IT INDUSTRY", "RAPID APPLICATION DEVELOPMENT USING PYTHON",
                "UNIX PROGRAMMING"};
    }

    private void Computer_Science_Engineering_VI2021() {
        subjectArr = new String[]{"Software Engineering and Project Management", "Fullstack Development", "Computer Graphics and Fundamentals of Image Processing",
                "Agile Technology", "Advanced Computer Architecture", "Advanced JAVA Programming", "Data science and Visualization",
                "Introduction to Data Structures", "Introduction to Cyber Security", "Introduction to Database Management Systems", "Programming in JAVA",
                "Computer Graphics and Image Processing Laboratory", "Mini Project", "Innovation/Entrepreneurship /Societal Internship"};

    }

    private void Computer_Science_Engineering_VI() {
        subjectArr = new String[]{"CLOUD COMPUTING AND ITS APPLICATIONS", "COMPUTER GRAPHICS LABORATORY WITH MINI PROJECT",
                "COMUTER GRAPHICS AND VISUALIZATION", "CRYPTOGRAPHY, NETWORK SECURITY AND CYBERLAW", "DATA MINING AND DATA WAREHOUSING",
                "INTRODUCTION TO DATA SRUCTURES AND ALGORITHMS", "MOBILE APPLICATION DEVELOPMENT (OPEN ELECTIVE)", "MOBILE APPLICATION DEVELOPMENT",
                "OBJECT ORIENTED MODELING AND DESIGN", "PYTHON APPLICATION PROGRAMMING (OPEN ELECTIVE)", "SYSTEM SOFTWARE AND COMPILER",
                "SYSTEM SOFTWARE AND OPERATING SYSTEM LABORATORY"};
    }

    private void Computer_Science_Engineering_VII2021() {
        subjectArr = new String[]{"Big Data Analytics", "Cloud Computing", "Blockchain Technology", "Internet of Things",
                "Cryptography and Network Security", "Software Architecture and Design Patterns", "NoSQL Data Base", "Deep Learning",
                "Programming in Python", "Introduction to Data Science",
                "Introduction to AI and ML", "Introduction to Big Data", "Project work"};

    }

    private void Computer_Science_Engineering_VII() {
        subjectArr = new String[]{"ADVANCED JAVA AND J2EE", "ARTIFICIAL INTELLIGENCE AND MACHINE LEARNING LABORATORY",
                "ARTIFICIAL INTELLIGENCE AND MACHINE LEARNING", "BIG DATA AND ANALYTICS", "DIGITAL IMAGE PROCESSING",
                "INTRODUCTION TO BIG DATA ANALYTICS", "INTRODUCTION TO OPERATING SYSTEM", "NETWORK MANAGEMENT", "PROGRAMMING IN JAVA",
                "SOFTWARE ARCHITECTURE AND DESIGN PATTERNS", "STORAGE AREA NETWORKS", "WEB TECHNOLOGY AND ITS APPLICATIONS"};
    }

    private void Computer_Science_Engineering_VIII() {
        subjectArr = new String[]{"ADVANCED COMPUTER ARCHITECTURES", "INTERNET OF THINGS", "MOBILE COMPUTING",
                "NOSQL DATABASE"};
    }

    private void Electrical_Electronics_Engineering_III2021() {
        subjectArr = new String[]{"Transform Calculus, Fourier Series and Numerical Techniques", "Electric Circuit Analysis", "Transformers and Generators", "Analog Electronic Circuits", "Digital System Design", "Electrical and Electronic Measurements", "Electrical Machines Laboratory -1", "Electronics Laboratory", "18KVK39/49 Or 18KAK39/49 Or 18CPC39/49"};

    }


    private void Electrical_Electronics_Engineering_III() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – I", "ANALOG ELECTRONIC CIRCUITS", "Aadalitha Kannada",
                "CONSTITUTION OF INDIA, PROFESSIONAL ETHICS AND CYBER LAW (CPC)", "DIGITAL SYSTEM DESIGN", "ELECTRIC CIRCUIT ANALYSIS",
                "ELECTRICAL AND ELECTRONIC MEASUREMENTS", "ELECTRICAL MACHINES LABORATORY - 1", "ELECTRONICS LABORATORY",
                "TRANSFORM CALCULUS, FOURIER SERIES AND NUMERICAL TECHNIQUES", "TRANSFORMERS AND GENERATORS",
                "Vyavaharika Kannada"};
    }

    private void Electrical_Electronics_Engineering_IV2021() {
        subjectArr = new String[]{"Complex Analysis, Probability And Statistical Methods", "Power Generation and Economics",
                "Transmission and Distribution", "Electric Motors", "Electromagnetic Field Theory", "Operational Amplifiers and Linear EEE 3 ICs",
                "Electrical Machines Laboratory -2", "Op- amp and Linear ICs EEE Laboratory", "18KVK39/49 Or 18KAK39/49 Or 18CPC39/49"};

    }

    private void Electrical_Electronics_Engineering_IV() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – II", "COMPLEX ANALYSIS, PROBABILITY AND STATISTICAL METHODS",
                "ELECTRIC MOTORS", "ELECTRICAL MACHINES LABORATORY - 2", "ELECTROMAGNETIC FIELD THEORY", "OP- AMP AND LINEAR ICS LABORATORY",
                "OPERATIONAL AMPLIFIERS AND LINEAR ICs", "POWER GENERATION AND ECONOMICS", "TRANSMISSION AND DISTRIBUTION"};
    }

    private void Electrical_Electronics_Engineering_V2021() {
        subjectArr = new String[]{"Management and Entrepreneurship", "Microcontroller", "Power Electronics", "Signals and Systems", "Electrical Machine Design", "High V oltage Engineering", "Microcontroller Laboratory", "Power Electronics Laboratory", "Environmental Studies"};

    }

    private void Electrical_Electronics_Engineering_V() {
        subjectArr = new String[]{"ELECTRICAL MACHINE DESIGN (Core Course)", "ENVIRONMENTAL STUDIES", "HIGH VOLTAGE ENGINEERING",
                "MANAGEMENT AND ENTREPRENEURSHIP", "MICROCONTROLLER LABORATORY", "MICROCONTROLLER", "POWER ELECTRONICS LABORATORY",
                "POWER ELECTRONICS", "SIGNALS AND SYSTEMS"};
    }

    private void Electrical_Electronics_Engineering_VI2021() {
        subjectArr = new String[]{"Control Systems", "Power System Analysis – 1", "Digital Signal Processing",
                "Sensors and Transducer", "Electrical Machine Design", "Utilization of Electrical Power", "Industrial Servo Control Systems",
                "Control System Laboratory",
                "Digital Signal Processing Laboratory", "Mini-Project", "Internship"};

    }

    private void Electrical_Electronics_Engineering_VI() {
        subjectArr = new String[]{"COMPUTER AIDED ELECTRICAL DRAWING (PROFESSIONAL", "CONTROL SYSTEM LABORATORY", "CONTROL SYSTEMS (Core Subject)",
                "DIGITAL SIGNAL PROCESSING (Core Subject)", "DIGITAL SIGNAL PROCESSING LABORATORY", "ELECTRICAL ENGINEERING MATERIALS (Professional Elective)",
                "EMBEDDED SYSTEMS (PROFESSIONAL ELECTIVE)", "INDUSTRIAL SERVO CONTROL SYSTEMS(Open Elective)", "INTRODUCTION TO NUCLEAR POWER ( PROFESSIONAL ELECTIVE )",
                "OBJECT ORIENTED PROGRAMMING USING C++ (PROFESSIONAL ELECTIVE)", "PLC and SCADA (Open Elective)", "POWER SYSTEM ANALYSIS – 1 (Core Subject)",
                "RENEWABLE ENERGY RESOURCES( Open Elective )", "TESTING AND COMMISSIONING OF POWER SYSTEM APPARATUS (Open Elective)"};
    }

    private void Electrical_Electronics_Engineering_VII2021() {
        subjectArr = new String[]{"Power System Analysis – 2", "Power System Protection", "Power Systems Planning", "Electric Vehicle Technologies",
                "Computer Aided Electrical Drawing", "Industrial Drives and Applications", "Carbon Capture and Storage", "Electrical Power Quality",
                "PSS laboratory", "Relay & HV lab",
                "Project Work Phase - 1", "Internship"};

    }

    private void Electrical_Electronics_Engineering_VII() {
        subjectArr = new String[]{"ADVANCED CONTROL SYSTEMS (Professional Elective)", "ARTIFICIAL NEURAL NETWORK WITH APPLICATIONS TO POWER SYSTEMS (Professional Elective)",
                "ELECTRIC VEHICLES (Open Elective)", "ELECTRICAL ENERGY CONSERVATION AND AUDITING (Open Elective)", "INDUSTRIAL DRIVES AND APPLICATIONS (Professional Elective)",
                "INDUSTRIAL MOTORS & CONTROL ( Open Elective )", "INTEGRATION OF DISTRIBUTED GENERATION(Professional Elective)",
                "PLC and SCADA(Professional Elective)", "POWER SYSTEM ANALYSIS – 2(Core Course)", "POWER SYSTEM PROTECTION (Core Subject)",
                "POWER SYSTEM SIMULATION LABORATORY", "PROJECT PHASE – I", "REACTIVE POWER CONTROL IN ELECTRIC POWER SYSTEMS (Professional Elective)",
                "RELAY AND HIGH VOLTAGE LABORATORY", "SENSORS AND TRANSDUCERS (Open Elective)", "SENSORS AND TRANSDUCERS (Professional Elective)",
                "SMART GRID ( Professional Elective)", "SOLAR AND WIND ENERGY (Professional Elective)", "UTILIZATION OF ELECTRICAL POWER(Professional Elective)"};
    }

    private void Electrical_Electronics_Engineering_VIII() {
        subjectArr = new String[]{"ELECTRIC VEHICLE TECHNOLOGIES (Professional Elective)", "ELECTRICAL ESTMATION AND COSTING (Professional Elective)",
                "ELECTRICAL POWER QUALITY (Professional Elective)", "FACTS AND HVDC TRANSMISSION ( Professional Elective )",
                "INTERNSHIP", "POWER SYSTEM OPERATION AND CONTROL(Core Course)", "POWER SYSTESMEMPELSATNENRIN-VGII(PI rofessional Elective)"};
    }

    private void Electronics_Communication_Engineering_III2021() {
        subjectArr = new String[]{"Mathematics Course (Common to all)", "Digital System Design using Verilog", "Basic Signal Processing", "Analog Electronic Circuits", "Analog & Digital Electronics Lab", "Social Connect and Responsibility", "Kannada", "Ability Enhancement Course - III"};

    }

    private void Electronics_Communication_Engineering_III() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – I", "Aadalitha Kannada", "COMPUTER ORGANIZATION AND ARCHITECTURE",
                "CONSTITUTION OF INDIA, PROFESSIONAL ETHICS AND CYBER LAW (CPC)", "DIGITAL SYSTEM DESIGN LABORATORY", "DIGITAL SYSTEM DESIGN",
                "ELECTRONIC DEVICES AND INSTRUMENTATION LABORATORY", "ELECTRONIC DEVICES", "NETWORK THEORY", "POWER ELECTRONICS AND INSTRUMENTATION",
                "TRANSFORM CALCULUS, FOURIER SERIES AND NUMERICAL TECHNIQUES", "Vyavaharika Kannada"};
    }

    private void Electronics_Communication_Engineering_IV2021() {
        subjectArr = new String[]{"Maths for Communication Engineers", "Digital Signal Processing", "Circuits & Controls", "Communication Theory", "Biology For Engineers", "Communication Laboratory I", "Kannada", "Ability Enhancement Course- IV", "Universal Human Values", "Inter/Intra Institutional Internship"};

    }

    private void Electronics_Communication_Engineering_IV() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – II", "ANALOG CIRCUITS LABORATORY", "ANALOG CIRCUITS",
                "COMPLEX ANALYSIS, PROBABILITY AND STATISTICAL METHODS", "CONTROL SYSTEMS", "ENGINEERING STATISTICS and LINEAR ALGEBRA",
                "MICROCONTROLLER LABORATORY", "MICROCONTROLLER", "SIGNALS AND SYSTEMS"};
    }

    private void Electronics_Communication_Engineering_V2021() {
        subjectArr = new String[]{"Digital Communication", "Object Oriented Programming with Java & Data Structures", "Computer Communication Networks", "Microwave Theory & Antennas", "Communication Lab II", "Research Methodology & Intellectual Property Rights", "Environmental Studies", "Ability Enhancement Course-V"};

    }

    private void Electronics_Communication_Engineering_V() {
        subjectArr = new String[]{"DIGITAL SIGNAL PROCESSING LABORATORY", "DIGITAL SIGNAL PROCESSING", "ELECTROMAGNETIC WAVES",
                "ENVIRONMENTAL STUDIES", "HDL LABORATORY", "INFORMATION THEORY and CODING", "PRINCIPLES OF COMMUNICATION SYSTEMS",
                "TECHNOLOGICAL INNOVATION MANAGEMENT AND ENTREPRENEURSHIP", "Verilog HDL"};
    }

    private void Electronics_Communication_Engineering_VI2021() {
        subjectArr = new String[]{"Technological Innovation Management and Entrepreneurship", "Computer Organization & ARM Microcontrollers",
                "VLSI Design & Testing", "Artificial Neural Networks", "Python Programming", "Communication Engineering", "Basic VLSI Design",
                "VLSI Laboratory", "Mini Project", "Innovation/Entrepreneurship /Societal Internship"};

    }

    private void Electronics_Communication_Engineering_VI() {
        subjectArr = new String[]{"ARITIFICAL NEURAL NETWORKS", "COMMUNICATION LAB", "DATA STRUCTURE USING C++", "DIGITAL COMMUNICATION",
                "DIGITAL SYSTEM DESIGN USING VERILOG", "EMBEDDED SYSTEMS LAB", "EMBEDDED SYSTEMS", "MICROWAVE and ANTENNAS", "NANOELECTRONICS",
                "OPERATING SYSTEM", "PYTHON APPLICATION PROGRAMMING", "SENSORS and SIGNAL CONDITIONING", "SIGNAL PROCESSING"};
    }

    private void Electronics_Communication_Engineering_VII2021() {
        subjectArr = new String[]{"Advanced VLSI", "Optical & Wireless Communication",
                "Advanced Design Tools for VLSI", "Biomedical Signal Processing", "IoT & Wireless Sensor Networks", "Machine Learning with Python",
                "Optical & Satellite Communication", "Basic Digital Signal Processing", "Professional Elective - III",
                "Open Elective -II", "Project work"};

    }

    private void Electronics_Communication_Engineering_VII() {
        subjectArr = new String[]{"AUTOMOTIVE ELECTRONICS", "COMMUNICATION THEORY", "COMPUTER NETWORKS LAB",
                "COMPUTER NETWORKS", "CRYPTOGRAPHY", "DIGITAL IMAGEPROCESSING", "DSP ALGORITHMS and ARCHITECTURE",
                "IoT & WIRELESS SENSOR NETWORKS", "MACHINE LEARNING WITH PYTHON", "MULTIMEDIA COMMUNICATION",
                "NEURAL NETWORKS", "REAL TIME SYSTEM", "SATELLITE COMMUNICATION", "VLSI DESIGN", "VLSI LAB"};
    }

    private void Electronics_Communication_Engineering_VIII() {
        subjectArr = new String[]{"BIOMEDICAL SIGNAL PROCESSING", "MICRO ELECTROMECHANICAL SYSTEMS", "NETWORK SECURITY",
                "OPTICAL COMMUNICATION NETWORKS", "RADAR ENGINEERING", "WIRELESS AND CELLULAR COMMUNICATION"};
    }

    private void Electronics_Instrumentation_Engineering_III2021() {
        subjectArr = new String[]{"Transform Calculus, Fourier Series and Numerical Techniques", "Analog Electronic Circuits",
                "Digital Design and HDL", "Measurement and Transducers", "Measurementand TransducersLab", "Social Connect and Responsibility",
                "kannada/Constitution", "Ability Enhancement Course - III"};
    }

    private void Electronics_Instrumentation_Engineering_III() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – I", "Aadalitha Kannada", "Analog Electronic Circuits Lab",
                "Analog Electronic Circuits", "CONSTITUTION OF INDIA, PROFESSIONAL ETHICS AND CYBER LAW (CPC)", "Digital Design and HDL Lab",
                "Digital Design and HDL", "Electronic Instrumentation and Measurements", "Network Analysis", "TRANSFORM CALCULUS, FOURIER SERIES AND NUMERICAL TECHNIQUES",
                "Transducers and Instrumentation", "Vyavaharika Kannada"};
    }

    private void Electronics_Instrumentation_Engineering_IV2021() {
        subjectArr = new String[]{"Complex Analysis, Probability and Statistical Methods", "Embedded Controllers",
                "Java Programming", "Signal Conditioning and Data Signal Conditioning and Data Acquisition Circuits",
                "Biology For Engineers", "Signal Conditioning and Data Acquisition Circuits Lab", "Kannada/Constitution",
                "Ability Enhancement Course- IV", "Universal Human Values", "Inter/Intra Institutional Internship"};
    }

    private void Electronics_Instrumentation_Engineering_IV() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – II", "COMPLEX ANALYSIS, PROBABILITY AND STATISTICAL METHODS",
                "Control Systems", "Embedded Controllers Lab", "Embedded Controllers", "Instrumentation and Measurement Lab",
                "Process Instrumentation", "Scientific and Analytical Instrumentation", "Signal Conditioning and Data Acquisition Circuits"};
    }

    private void Electronics_Instrumentation_Engineering_V2021() {
        subjectArr = new String[]{"Process Instrumentation", "Fundamentals of Signals and DSP", "ARM Processor", "Control Systems", "ARM Processor Lab", "Research Methodology & Intellectual Property Rights",
                "Environmental Studies", "Ability Enhancement Course-V"};
    }

    private void Electronics_Instrumentation_Engineering_V() {
        subjectArr = new String[]{"Biomedical Instrumentation", "Digital Signal Processing Lab", "ENVIRONMENTAL STUDIES",
                "Fundamentals of Signals and DSP", "Lasers and Optical Instrumentation", "Process Control Systems",
                "Signal Conditioning Circuits and Data Acquisition Lab", "Technological Innovation Management and Entrepreneurship",
                "VLSI Design"};
    }

    private void Electronics_Instrumentation_Engineering_VI2021() {
        subjectArr = new String[]{"Technological Innovation Management & Entrepreneurship", "Process Control Systems",
                "PLC, DCS and SCADA in Process Automation", "Scientific and Analytical Instrumentation", "Computer Communication Networks",
                "Measurements, Instrumentation and Transducers", "Optical Instrumentation", "Process Control and Virtual Instrumentation Lab", "Mini Project",
                "Innovation/Entrepreneurship /Societal Internship"};
    }

    private void Electronics_Instrumentation_Engineering_VI() {
        subjectArr = new String[]{"Aeronautical Instrumentation", "Analog and Digital Communication Systems", "Digital Image Processing",
                "Internship", "JAVA Programming Lab", "JAVA Programming", "Lasers and Optical Instrumentation", "Mini Project",
                "OPEN ELECTIVE - A", "Operating Systems", "Power Electronics, Controls and Communication Lab",
                "Power and Industrial Electronics", "Robotics and Automation", "Scientific and Analytical Instrumentation",
                "Transducers and Instrumentation"};
    }

    private void Electronics_Instrumentation_Engineering_VII2021() {
        subjectArr = new String[]{"Biomedical Instrumentation", "Lasers and Optical Instrumentation",
                "Aeronautical Instrumentation", "Medical Imaging Techniques", "Unit Operations & Industrial Process Instrumentation",
                "Neural Network and Fuzzy Logic Systems", "Medical Instrumentation", "Smart Sensors",
                "Project Work"};
    }

    private void Electronics_Instrumentation_Engineering_VII() {
        subjectArr = new String[]{"Biomedical Instrumentation", "Digital Signal Processing Lab", "ENVIRONMENTAL STUDIES",
                "Fundamentals of Signals and DSP", "Lasers and Optical Instrumentation", "Process Control Systems", "Signal Conditioning Circuits and Data Acquisition Lab",
                "Technological Innovation Management and Entrepreneurship", "VLSI Design"};
    }

    private void Electronics_Instrumentation_Engineering_VIII() {
        subjectArr = new String[]{"Artificial Intelligence and Machine Learning", "Industrial Process Instrumentation",
                "Instrumentation Buses and Industrial Data Networks", "Internship", "Medical Imaging Techniques", "Neural Network and Fuzzy Logic Systems",
                "Project Work Phase-2", "Technical Seminar"};
    }

    private void Electronics_Telecommunication_Engineering_III2021() {
        subjectArr = new String[]{"Mathematics Course", "Digital System Design using Verilog", "Basic Signal Processing", "Analog Electronic Circuits", "Analog and Digital Electronics Lab", "Social Connect and Responsibility", "Kannada", "Ability Enhancement Course - III"};

    }

    private void Electronics_Telecommunication_Engineering_III() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – I", "Aadalitha Kannada", "COMPUTER ORGANIZATION AND ARCHITECTURE",
                "CONSTITUTION OF INDIA, PROFESSIONAL ETHICS AND CYBER LAW (CPC)", "DIGITAL SYSTEM DESIGN LABORATORY",
                "DIGITAL SYSTEM DESIGN", "ELECTRONIC DEVICES AND INSTRUMENTATION LABORATORY", "ELECTRONIC DEVICES", "NETWORK THEORY",
                "POWER ELECTRONICS AND INSTRUMENTATION", "TRANSFORM CALCULUS, FOURIER SERIES AND NUMERICAL TECHNIQUES",
                "Vyavaharika Kannada"};
    }

    private void Electronics_Telecommunication_Engineering_IV2021() {
        subjectArr = new String[]{"Maths for Communication Engineers", "Digital Signal Processing", "Circuits & Controls", "Communication Theory", "Biology For Engineers", "Communication Laboratory I", "Kannada", "Ability Enhancement Course- IV", "Universal Human Values", "Inter/Intra Institutional Internship"};
    }

    private void Electronics_Telecommunication_Engineering_IV() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – II", "ANALOG CIRCUITS", "COMPLEX ANALYSIS, PROBABILITY AND STATISTICAL METHODS",
                "CONTROL SYSTEMS", "ENGINEERING STATISTICS and LINEAR ALGEBRA", "MICROCONTROLLER LABORATORY", "MICROCONTROLLER", "SIGNALS AND SYSTEMS"};
    }

    private void Electronics_Telecommunication_Engineering_V2021() {
        subjectArr = new String[]{"Digital Communication", "Object Oriented Programming with Java & Data Structures", "Computer Communication Networks", "Microwave Theory & Antennas", "Communication Lab II", "Research Methodology & Intellectual Property Rights", "Environmental Studies", "Ability Enhancement Course-V"};

    }

    private void Electronics_Telecommunication_Engineering_V() {
        subjectArr = new String[]{"DIGITAL SIGNAL PROCESSING LABORATORY", "DIGITAL SIGNAL PROCESSING", "ELECTROMAGNETIC WAVES",
                "ENVIRONMENTAL STUDIES", "HDL LABORATORY", "INFORMATION THEORY and CODING", "PRINCIPLES OF COMMUNICATION SYSTEMS", "TECHNOLOGICAL INNOVATION MANAGEMENT AND ENTREPRENEURSHIP",
                "Verilog HDL"};
    }

    private void Electronics_Telecommunication_Engineering_VI2021() {
        subjectArr = new String[]{"Technological Innovation Management and Entrepreneurship", "Computer Organization & ARM Microcontrollers",
                "Wireless and Cellular Communication", "Artificial Neural Networks", "Python Programming ", "Communication Engineering",
                "Basic VLSI Design",
                "Wireless and Cellular Communication Laboratory", "Mini Project",
                "Innovation/Entrepreneurship /Societal Internship"};

    }

    private void Electronics_Telecommunication_Engineering_VI() {
        subjectArr = new String[]{"ANALOG and DIGITAL COMMUNICATION LAB", "ARITIFICAL NEURAL NETWORKS", "COMPUTER COMMUNICATION NETWORKS LAB",
                "COMPUTER COMMUNICATION NETWORKS", "DIGITAL COMMUNICATION", "EMBEDDED MICROCONTROLLER and SYSTEMS", "MICROWAVE THEORY and ANTENNAS",
                "OBJECT ORIENTED PROGRAMMING USING C++", "OPERATING SYSTEM", "RADIO FREQUENCY INTEGRATED CIRCUITS", "SENSORS AND SIGNAL CONDITIONING",
                "SIGNAL PROCESSING"};
    }

    private void Electronics_Telecommunication_Engineering_VII2021() {
        subjectArr = new String[]{"VLSI Circuits & Systems", "Optical Communication and Optical networks",
                "Advanced Design Tools for VLSI", "Biomedical Signal Processing", "IoT & Wireless Sensor Networks", "Machine Learning with Python ",
                "Optical & Satellite Communication", "Basic Digital Signal Processing ",
                "Project work"};

    }

    private void Electronics_Telecommunication_Engineering_VII() {
        subjectArr = new String[]{"AUTOMOTIVE ELECTRONICS", "CMOS VLSI DESIGN", "COMMUNICATION THEORY", "CRYPTOGRAPHY", "DATA STRUCTURES USING C++",
                "DIGITAL IMAGE PROCESSING", "IoT& WIRELESS SENSOR NETWORKS", "MACHINE LEARNING", "MICROWAVE and ANTENNAS LAB", "MULTIMEDIA COMMUNICATION",
                "NEURAL NETWORKS", "OPTICAL COMMUNICATION", "REAL TIME SYSTEM", "SATELLITE COMMUNICATION", "WIRELESS COMMUNICATION LAB", "WIRELESS COMMUNICATIONS"};
    }

    private void Electronics_Telecommunication_Engineering_VIII() {
        subjectArr = new String[]{"ADVANCED CELLULAR COMMUNICATION", "MICRO ELECTROMECHANICAL SYSTEMS", "NETWORK MANAGEMENT",
                "NETWORK SECURITY", "RADAR ENGINEERING", "SUSTAINABLE TELECOMMUNICATION NETWORKS"};
    }

    private void Industrial_Production_Engineering_III2021() {
        subjectArr = new String[]{"Transform Calculus, Fourier Series and Numerical Techniques", "Material Science and Metallurgy", "Manufacturing Process - I", "Basic Thermodynamics and Fluid Mechanics",
                "Computer Aide Component Drawing", "Social Connect and Responsibility", "Kannada/Constitution"};
    }


    private void Industrial_Production_Engineering_III() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – I", "Aadalitha Kannada", "BASIC THERMODYNAMICS",
                "CONSTITUTION OF INDIA, PROFESSIONAL ETHICS AND CYBER LAW (CPC)", "FLUID MECHANICS", "FOUNDRY AND FORGING LABORATORY",
                "MANUFACTURING PROCESS - I", "MECHANICAL MEASUREMENTS", "MECHANICS OF MATERIALS", "METROLOGY AND MEASUREMENTS LABORATORY",
                "TRANSFORM CALCULUS, FOURIER SERIES AND NUMERICAL TECHNIQUES", "Vyavaharika Kannada"};
    }

    private void Industrial_Production_Engineering_IV2021() {
        subjectArr = new String[]{"Complex Analysis, Probability and Linear Programming", "Mechanical Measurements and Metrology", "Manufacturing Process - II ", "Mechanics of Materials",
                "Biology For Engineers", "CAD and CAE Lab", "Kannada/Constitution"};
    }

    private void Industrial_Production_Engineering_IV() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – II", "CADCAM", "COMPLEX ANALYSIS, PROBABILITY AND STATISTICAL METHODS",
                "COMPUTER AIDED MACHINE DRAWING", "KINEMATICS OF MACHINES", "MACHINE SHOP", "MANUFACTURING PROCESS- II", "MATERIAL SCIENCE AND METALLURGY",
                "METALLOGRAPHY AND MATERIAL TESTING LABORATORY"};
    }

    private void Industrial_Production_Engineering_V2021() {
        subjectArr = new String[]{"Design of Machine Elements", "Computer Integrated Manufacturing and Automation", "Quality Assurance and Reliability", "Hydraulics and Pneumatics", "Energy Engineering Lab",
                "Research Methodology & Intellectual Property Rights", "Environmental Studies", "Ability Enhancement Course-V"};
    }

    private void Industrial_Production_Engineering_V() {
        subjectArr = new String[]{"COMPOSITE MATERIALS", "DESIGN OF MACHINES ELEMENTS", "ENVIRONMENTAL STUDIES", "HYDRAULICS AND PNEUMATICS",
                "MANAGEMENT AND ENTREPRENEURSHIP", "MECHANICAL AND FLUID POWER LAB", "QUALITY ASSURANCE AND RELIABILITY", "WORK STUDY AND ERGONOMICS LAB",
                "WORK STUDY AND ERGONOMICS"};
    }

    private void Industrial_Production_Engineering_VI2021() {
        subjectArr = new String[]{"Management and Entrepreneurship", "Work Study and Ergonomics", "Operations Research",
                "Kinematics of Machines", "Engineering Economy", "Total Quality Management", "Industrial Hygiene & Occupational Safety and Health",
                "Software Applications Lab",
                "Mini Project", "Innovation/Entrepreneurship/Societal Internship"};
    }

    private void Industrial_Production_Engineering_VI() {
        subjectArr = new String[]{"ADVANCED MACHINING PROCESS", "CADCAM LAB", "COMPUTER INTEGRATED MANUFACTURING", "ENGINEERING ECONOMY",
                "INTERNSHIP", "MACHINE TOOL LAB", "MANAGEMENT INFORMATION SYSTEMS", "MINI PROJECT", "OPERATIONS RESEARCH", "THEORY OF METAL FORMING",
                "TOOL ENGINEERING AND DESIGN", "TOTAL QUALITY MANAGEMENT", "VALUE ENGINEERING"};
    }

    private void Industrial_Production_Engineering_VII2021() {
        subjectArr = new String[]{"Artificial Intelligence and Manufacturing", "Micro Economic Theory",
                "Non-Destructive Testing", "Facility Planning and Design", "Simulation and Modelling of Manufacturing Systems",
                "Advanced Joining Processes", "Project Management", "Design of Experiments",
                "Open Elective Course-II", "Project work"};
    }

    private void Industrial_Production_Engineering_VII() {
        subjectArr = new String[]{"AUTOMOBILE ENGINEERING", "AUTOMOTIVE ENGINEERING", "CNC AND ROBOTICS LAB", "DESIGN OF EXPERIMENTS", "ENTERPRISE RESOURCE PLANNING",
                "HUMAN RESOURCE MANAGEMENT", "JUST IN TIME MANUFACTURING", "MARKETING MANAGEMENT", "MECHA TRONICS", "NON–CONVENTIONAL MACHINING PROCESSES",
                "OPERATIONS MANAGEMENT", "PROJECT MANAGEMENT", "PROJECT WORK PHASE - I", "SOFTWARE APPLICATIONS LAB"};
    }

    private void Industrial_Production_Engineering_VIII() {
        subjectArr = new String[]{"ADVANCED JOINING PROCESS AND NDT", "AUTOMATION IN MANUFACTURING", "FACILITY PLANNING AND DESIGN",
                "PROJECT WORK PHASE -II", "SUPPLY CHAIN MANAGEMENT", "TECHNICAL SEMINAR"};
    }

    private void Information_Science_Engineering_III2021() {
        subjectArr = new String[]{"Transform Calculus, Fourier Series And Numerical Techniques", "Data Structures and Applications", "Analog and Digital Electronics", "Computer Organization and Architecture", "Object Oriented Programming with JAVA Laboratory", "Social Connect and Responsibility", "Kannada", "Ability Enhancement Course - III"};

    }


    private void Information_Science_Engineering_III() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – I", "ANALOG AND DIGITAL ELECTRONICS LABORATORY", "ANALOG AND DIGITAL ELECTRONICS",
                "Aadalitha Kannada", "COMPUTER ORGANIZATION", "CONSTITUTION OF INDIA, PROFESSIONAL ETHICS AND CYBER LAW (CPC)",
                "DATA STRUCTURES AND APPLICATIONS", "DATA STRUCTURES LABORATORY", "DISCRETE MATHEMATICAL STRUCTURES",
                "SOFTWARE ENGINEERING", "TRANSFORM CALCULUS, FOURIER SERIES AND NUMERICAL TECHNIQUES", "Vyavaharika Kannada"};
    }

    private void Information_Science_Engineering_IV2021() {
        subjectArr = new String[]{"Mathematical Foundations for Computing", "Design and Analysis of Algorithms", "Operating Systems", "Biology For Engineers", "Python Programming Laboratory", "OR\n" +
                "Constitution of India & Professional Ethics", "Ability Enhancement Course- IV", "Universal Human Values", "Inter/Intra Institutional Internship"};

    }

    private void Information_Science_Engineering_IV() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – II", "COMPLEX ANALYSIS, PROBABILITY AND STATISTICAL METHODS",
                "DATA COMMUNICATION", "DESIGN AND ANALYSIS OF ALGORITHMS LABORATORY", "DESIGN AND ANALYSIS OF ALGORITHMS",
                "MANAGEMENT AND ENTREPRENEURSHIP FOR IT INDUSTRY", "MICROCONTROLLER AND EMBEDDED SYSTEMS LABORATORY", "MICROCONTROLLER AND EMBEDDED SYSTEMS",
                "OPERATING SYSTEMS"};
    }

    private void Information_Science_Engineering_V2021() {
        subjectArr = new String[]{"Automata Theory and compiler Design", "Computer Networks", "Database Management Systems", "Artificial Intelligence and Machine Learning", "Database Management Systems Laboratory with Mini Project", "Research Methodology & Intellectual Property Rights", "Environmental Studies", "Ability Enhancement Course-V"};

    }

    private void Information_Science_Engineering_V() {
        subjectArr = new String[]{"APPLICATION DEVELOPMENT USING PYTHON", "AUTOMATA THEORY AND COMPUTABILITY", "COMPUTER NETWORK LABORATORY",
                "COMPUTER NETWORKS AND SECURITY", "DATABASE MANAGEMENT SYSTEM", "DBMS LABORATORY WITH MINI PROJECT", "OBJECT ORIENTED CONCEPTS",
                "UNIX PROGRAMMING"};
    }

    private void Information_Science_Engineering_VI2021() {
        subjectArr = new String[]{"Software Engineering and Project Management", "Fullstack Development", "Software Testing",
                "Agile Technology", "Data Mining and Data warehousing", "Introduction to Data Structures",
                "Introduction to Cyber Security",
                "Software Testing Laboratory", "Mini Project", "Innovation/Entrepreneurship /Societal Internship"};

    }

    private void Information_Science_Engineering_VI() {
        subjectArr = new String[]{"ADVANCED JAVA AND J2EE", "CLOUD COMPUTING AND ITS APPLICATIONS", "DATA MINING AND DATA WAREHOUSING",
                "ENVIRONMENTAL STUDIES", "FILE STRUCTURES LABORATORY WITH MINI PROJECT", "FILE STRUCTURES", "INFORMATION MANAGEMENT SYSTEM",
                "INTRODUCTION TO DATA SRUCTURES AND ALGORITHM", "MOBILE APPLICATION DEVELOPMENT", "MOBILE APPLICATION DEVELOPMENT",
                "OBJECT ORIENTED MODELING AND DESIGN", "PROGRAMMING IN JAVA", "PYTHON APPLICATION PROGRAMMING", "SOFTWARE TESTING LABORATORY",
                "SOFTWARE TESTING", "WEB TECHNOLOGY AND ITS APPLICATIONS"};
    }

    private void Information_Science_Engineering_VII2021() {
        subjectArr = new String[]{"Cryptography and Network Security", "Cloud Computing",
                "Object oriented Modelling and Design", "Blockchain Technology", "Software Architecture and Design Patterns",
                "Robotic Process Automation Design and Development", "Programming in Python ", "Introduction to Data Science",
                "Open elective Course-II", "Project work"};

    }

    private void Information_Science_Engineering_VII() {
        subjectArr = new String[]{"ARTIFICIAL INTELLIGENCE AND MACHINE LEARNING LABORATORY", "ARTIFICIAL INTELLIGENCE AND MACHINE LEARNING",
                "BIG DATA AND ANALYTICS", "CRYPTOGRAPHY", "DIGITAL IMAGE PROCESSING", "HIGH PERFORMANCE COMPUTING", "INTRODUCTION TO ARTIFICIAL INTELLIGENCE",
                "INTRODUCTION TO BIG DATA ANALYTICS", "INTRODUCTION TO DOT NET FRAMEWORK FOR APPLICATION DEVELOPMENT",
                "INTRODUCTION TO OPERATING SYSTEM", "NATURAL LANGUAGE PROCESSING", "NETWORK MANAGEMENT", "ROBOTIC PROCESS AUTOMATION DESIGN & DEVELOPMENT",
                "SOFTWARE ARCHITECTURE AND DESIGN PATTERNS", "STORAGE AREA NETWORKS", "USER INTERFACE DESIGN"};
    }

    private void Information_Science_Engineering_VIII() {
        subjectArr = new String[]{"ADVANCED COMPUTER ARCHITECTURES", "INTERNET OF THINGS", "MOBILE COMPUTING", "MULTICORE ARCHITECTURE AND PROGRAMMING",
                "NOSQL DATABASE"};
    }


    //todo manufacturing science and engineering 2021 scheme is not available currently
    private void Manufacturing_Science_Engineering_III() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – I", "Aadalitha Kannada", "BASIC THERMODYNAMICS",
                "COMPUTER AIDED MACHINE DRAWING", "CONSTITUTION OF INDIA, PROFESSIONAL ETHICS AND CYBER LAW (CPC)",
                "FOUNDRY AND FORGING LAB", "FOUNDRY TECHNOLOGY", "MATERIAL SCIENCE", "MATERIAL TESTING LAB",
                "MECHANICS OF MATERIALS", "TRANSFORM CALCULUS, FOURIER SERIES AND NUMERICAL TECHNIQUES",
                "Vyavaharika Kannada"};
    }

    private void Manufacturing_Science_Engineering_IV() {
        subjectArr = new String[]{"COMPLEX ANALYSIS, PROBABILITY AND STATISTICAL METHODS", "FLUID MECHANICS AND MACHINERY LAB",
                "FLUID MECHANICS AND MACHINES", "JOINING PROCESSES", "MACHINE TOOLS AND OPERATIONS", "MECHANICAL MEASUREMENTS AND METROLOGY LAB",
                "MECHANICAL MEASUREMENTS AND METROLOGY", "THEORY OF MACHINES"};
    }

    private void Manufacturing_Science_Engineering_V() {
        subjectArr = new String[]{"COMPUTER AIDED DESIGN AND MANUFACTURING LAB", "COMPUTER AIDED DESIGN AND MANUFACTURING",
                "ELEMENTS OF MACHINE DESIGN", "ENVIRONMENTAL STUDIES", "MANAGEMENT AND ENTREPRENEURSHIP", "METAL FORMING",
                "Operations Research", "STATISTICAL QUALITY CONTROL", "WORKSHOP AND MACHINE SHOP PRACTICE"};
    }

    private void Manufacturing_Science_Engineering_VI() {
        subjectArr = new String[]{"ADDITIVE MANUFACTURING LABORATORY", "ADDITIVE MANUFACTURING", "AUTOMATION AND ROBOTICS",
                "COMPUTER INTEGRATED MANUFACTURING", "Knowledge Management", "MAINTENANCE ENGINEERING", "Machine Tool Design",
                "NON DESTRUCTIVE TESTING LABORATORY", "NON DESTRUCTIVE TESTING", "TOOL ENGINEERING"};
    }

    private void Manufacturing_Science_Engineering_VII() {
        subjectArr = new String[]{"CONTROL ENGINEERING", "FACILITY PLANNING AND DESIGN", "HYDRAULIC CIRCUITS AND PROGRAMMABLE LOGIC CONTROLLERS (PLC) LABORATORY",
                "HYDRAULIC CIRCUITS AND PROGRAMMABLE LOGIC CONTROLLERS (PLC)", "JIGS AND FIXTURES", "MODELING AND SIMULATION LABORATORY",
                "Optimization Techniques", "PRECISION ENGINEERING", "PROCESS PLANNING", "QUALITY ASSURANCE", "SUPPLY CHAIN MANAGEMENT",
                "SURFACE ENGINEERING"};
    }

    private void Manufacturing_Science_Engineering_VIII() {
        subjectArr = new String[]{"FLEXIBLE MANUFACTURING SYSTEMS", "PRODUCT LIFECYCLE MANAGEMENT", "PROJECT MANAGEMENT", "TOTAL QUALITY MANAGEMENT"};
    }

    private void Marine_Engineering_III2021() {
        subjectArr = new String[]{"Basic Mathematics", "Ship structure and construction ", "Materials& Mechanics of Materials", "Thermodynamics", "Marine Machine Drawing",
                "SummerInternship–I", "Kannada/Constitution", "AbilityEnhancementCourse-III ", "Social Connect And Responsibility"};
    }


    private void Marine_Engineering_III() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – I", "BASIC THERMODYNAMICS", "ELEMENTARY NAVIGATION, SEAMANSHIP AND SURVIVAL AT SEA",
                "MATERIAL SCIENCE", "MATERIAL TESTING LAB(3) MECHANICAL MEASUREMENTS AND METROLOGY LAB", "MECHANICAL MEASUREMENTS AND METROLOGY",
                "MECHANICS OF MATERIALS", "TRANSFORM CALCULUS, FOURIER SERIES AND NUMERICAL TECHNIQUES"};
    }

    private void Marine_Engineering_IV2021() {
        subjectArr = new String[]{"Operations Research", "Marine Electrical Technology", "Fluid Mechanics", "Naval Architecture", "Biology For Engineers", "Mechanical Measurements & Metrology",
                "Kannada/Constitution", "AbilityEnhancementCourse- IV", "UniversalHumanValues &Professional Ethics"};
    }

    private void Marine_Engineering_IV() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – II", "APPLIED THERMODYNAMICS", "FLUID MECHANICS",
                "MACHINE SHOP AND FOUNDRY LAB(4) COMPUTER AIDED MARINE ENGINEERING DRAWING", "MARINE HEAT ENGINE AND AIR CONDITIONING",
                "SHIP STRUCTURE AND CONSTRUCTION", "THEORY OF MACHINES"};
    }

    private void Marine_Engineering_V2021() {
        subjectArr = new String[]{"Theory of Machines &Vibrations", "Thermo-fluids Engineering", "Marine Ic Engine", "Marine Boilers & turbines", "Vibration lab",
                "ResearchMethodology&IntellectualProperty Rights", "SummerInternship-II", "EnvironmentalStudies", "Physical Education (Sport & Athletics)/YOGA & NSS"};
    }

    private void Marine_Engineering_V() {
        subjectArr = new String[]{"ENVIRONMENTAL STUDIES", "FLUID MECHANICS AND MACHINES LAB", "MANAGEMENT AND ECONOMICS",
                "MARINE AUXILLARY MACHINES", "MARINE BOILERS", "MARINE ENGINE LAB", "MARINE INTERNAL COMBUSTION ENGINE- I",
                "NAVAL ARCHITECTURE", "TURBOMACHINES"};
    }

    private void Marine_Engineering_VI2021() {
        subjectArr = new String[]{"Ship Operations and Management", "Heat Transfer", "Machine design",
                "Advanced Marine Technology", "Control Engineering and Automation", "Introduction to Marine Engineering",
                "Material Science and Surface Coating Technology",
                "Marine workshop practice", "MiniProject", "AbilityEnhancementCourse-V"};
    }

    private void Marine_Engineering_VI() {
        subjectArr = new String[]{"ADVANCED MARINE TECHNOLOGY", "AUTOMATION AND INDUSTRIAL ROBOTICS",
                "CONTROL ENGINEERING", "DESIGN OF MACHINE ELEMENTS", "ENERGY ENGINEERING", "HEAT TRANSFER LAB",
                "HEAT TRANSFER", "MARINE ELECTRICAL LAB", "MARINE ELECTRICAL TECHNOLOGY", "MARINE INTERNAL COMBUSTION ENGINE-II",
                "MECHANICS OF COMPOSITE MATERIAL", "MICRO AND SMART TECHNOLOGY", "NON TRADITIONAL MACHINING"};
    }

    private void Marine_Engineering_VII2021() {
        subjectArr = new String[]{"Marine Auxiliary Machinery & Systems", "Ship Fire Prevention and Safety", "Marine Environmental Protection",
                "Shipping Trade", "Marine Engineering Practice", "Introduction to Marine Power Plant", "Introduction to Marine Robotics",
                "Project work", "Ability Enhancement Course –VI"};
    }

    private void Marine_Engineering_VII() {
        subjectArr = new String[]{"ADVANCED MARINE AUXILIARY MACHINES", "ENERGY AND ENVIRONMENT", "HYDRAULICS AND PNEUMATICS",
                "MARINE CORROSION AND PREVENTION", "MARINE MACHINERY AND SYSTEM DESIGN", "MECHA TRONICS", "MECHANICAL VIBRATION",
                "OPERATIONS RESEARCH", "PROJECT MANAGEMENT", "SHIP FIRE PREVENTION AND SAFETY", "SHIP RECYCLING", "SHIPPING PRACTICE",
                "SIMULATION LAB", "STABILITY OF SHIPS", "TRIBOLOGY", "VIBRATION LAB"};
    }

    private void Marine_Engineering_VIII2021() {
        subjectArr = new String[]{"TechnicalSeminar", "Research/IndustryInternship"};
    }

    private void Marine_Engineering_VIII() {
        subjectArr = new String[]{"ENGINE ROOM MANAGEMENT", "MARINE ENGINE PRACTICE", "SHIPPING TRADE", "STEAM ENGINEERING",
                "TRANSPORT AND LOGISTICS MANAGEMENT"};
    }

    private void Mechanical_Engineering_III2021() {
        subjectArr = new String[]{"Transform Calculus, Fourier Series And Numerical Techniques", "Metal casting, Forming and Joining Processes", "Material Science and Engineering", "Thermodynamics", "Machine Drawing and GD & T", "Social Connect and Responsibility", "Kannada", "Ability Enhancement Course-III"};

    }


    private void Mechanical_Engineering_III() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – I", "Aadalitha Kannada", "BASIC THERMODYNAMICS",
                "COMPUTER AIDED MACHINE DRAWING", "CONSTITUTION OF INDIA, PROFESSIONAL ETHICS AND CYBER LAW (CPC)",
                "FOUNDRY, FORGING AND WELDING LAB", "MATERIAL SCIENCE", "MATERIAL TESTING LAB", "MECHANICAL MEASUREMENTS AND METROLOGY LAB",
                "MECHANICAL MEASUREMENTS AND METROLOGY", "MECHANICS OF MATERIALS", "METAL CASTING AND WELDING", "METAL CUTTING AND FORMING",
                "TRANSFORM CALCULUS, FOURIER SERIES AND NUMERICAL TECHNIQUES", "Vyavaharika Kannada", "WORKSHOP AND MACHINE SHOP PRACTICE"};
    }

    private void Mechanical_Engineering_IV2021() {
        subjectArr = new String[]{"Complex Analysis, Probability and Linear Programming", "Machining Science and Jigs & Fixtures", "Fluid Mechanics", "Mechanics of Materials", "Biology For Engineers", "Mechanical Measurements and Metrology Lab", "Kannada", "Ability Enhancement Course- IV", "UniversalHumanValues", "Inter/Intra Institutional Internship"};

    }

    private void Mechanical_Engineering_IV() {
        subjectArr = new String[]{"APPLIED THERMODYNAMICS", "COMPLEX ANALYSIS, PROBABILITY AND STATISTICAL METHODS",
                "COMPUTER AIDED MACHINE DRAWING", "FLUID MECHANICS", "FOUNDRY, FORGING AND WELDING LAB", "KINEMATICS OF MACHINES",
                "MATERIAL TESTING LAB", "MECHANICAL MEASUREMENTS AND METROLOGY LAB", "MECHANICAL MEASUREMENTS AND METROLOGY",
                "METAL CASTING AND WELDING", "METAL CUTTING AND FORMING", "WORKSHOP AND MACHINE SHOP PRACTICE"};
    }

    private void Mechanical_Engineering_V2021() {
        subjectArr = new String[]{"Theory of Machines", "Thermo-fluids Engineering", "Finite Element Analysis", "Modern Mobility and Automotive Mechanics", "Design lab", "Research Methodology & Intellectual Property Rights", "Environmental Studies", "Ability Enhancement Course-V"};

    }

    private void Mechanical_Engineering_V() {
        subjectArr = new String[]{"DESIGN OF MACHINE ELEMENTS- I", "DYNAMICS OF MACHINES", "ENERGY CONVERSION LABORATORY",
                "ENVIRONMENTAL STUDIES", "FLUID MECHANICS AND MACHINES LAB", "FLUID POWER ENGINEERING", "MANAGEMENT AND ECONOMICS",
                "OPERATIONS MANAGEMENT", "TURBO MACHINES"};
    }

    private void Mechanical_Engineering_VI2021() {
        subjectArr = new String[]{"Production and Operations Management", "Heat Transfer", "Machine design",
                "Supply Chain Management & Introduction to SAP", "Autonomous Vehicles", "Project Management", "Mechatronics",
                "CNC Programming and 3-D Printing Lab",
                "Mini Project", "Innovation/Entrepreneurship /Societal Internship"};

    }

    private void Mechanical_Engineering_VI() {
        subjectArr = new String[]{"ADAVNCED VIBRATIONS", "ADVANCED MATERIALS TECHNOLOGY", "COMPOSITE MATERIALS TECHNOLOGY",
                "COMPUTER AIDED MODELLING AND ANALYSIS LAB", "DESIGN OF MACHINE ELEMENTS II", "ENERGY AND ENVIRONMENT",
                "FINITE ELEMENT METHODS", "HEAT TRANSFER LAB", "HEAT TRANSFER", "INDUSTRIAL SAFETY", "NON CONVENTIONAL ENERGY SOURCES",
                "NON-TRADITIONAL MACHINING", "OPTIMISATION TECHNIQUES", "REFRIGERATION AND AIR CONDITIONING", "SUPPLY CHAIN MANAGEMENT",
                "THEORY OF ELASTICITY", "WORLD CLASS MANUFACTURING"};
    }

    private void Mechanical_Engineering_VII2021() {
        subjectArr = new String[]{"Automation and Robotics", "Control Engg",
                "Additive Manufacturing", "MEMS and Microsystem Technology", "Advanced Vibrations and Condition Monitoring",
                "Product Design and Ergonomics",
                "Non-traditional Machining", "Operations Research", "Project work"};

    }

    private void Mechanical_Engineering_VII() {
        subjectArr = new String[]{"ADDITIVE MANUFACTURING", "AUTOMATION & ROBOTICS", "COMPUTATIONAL FLUID DYNAMICS",
                "COMPUTER AIDED DESIGN AND MANUFACTURING", "COMPUTRE AIDED MANUFACTURING LAB", "CONTROL ENGINEERING",
                "DESIGN FOR MANUFACTURE", "DESIGN LAB", "EMERGING SUSTAINABLE BUILDING COOLING TECHNOLOGIES", "MECHA TRONICS",
                "OPERATIONS RESEARCH", "PROJECT MANAGEMENT", "THEORYOF PLASTICITY", "TOTAL QUALITY MANAGEMENT"};
    }

    private void Mechanical_Engineering_VIII() {
        subjectArr = new String[]{"AUTOMOTIVE ENGINEERING", "CNC MACHINE TOOLS", "ENERGY ENGINEERING",
                "FRACTURE MECHANICS", "NON-DESTRUCTIVE TESTINGAND EVALUATION", "TOOL DESIGN", "TRIBOLOGY"};
    }

    private void Mechatronics2021() {
        subjectArr = new String[]{"Mechatronics"};
    }


    private void Mechatronics() {
        subjectArr = new String[]{"Mechatronics"};
    }

    //todo medical electronics 2021 scheme not available
    private void Medical_Electronics_III() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – I", "Aadalitha Kannada", "Analog Electronic Circuits Lab",
                "Analog Electronic Circuits", "CONSTITUTION OF INDIA, PROFESSIONAL ETHICS AND CYBER LAW (CPC)",
                "Digital Design and HDL Lab", "Digital Design and HDL", "Electronic Instrumentation and Measurements",
                "Human Anatomy and Physiology", "Network Analysis", "TRANSFORM CALCULUS, FOURIER SERIES AND NUMERICAL TECHNIQUES",
                "Vyavaharika Kannada"};
    }

    private void Medical_Electronics_IV() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – II", "Biomedical Transducers and Instrumentation",
                "COMPLEX ANALYSIS, PROBABILITY AND STATISTICAL METHODS", "Embedded Controllers Lab",
                "Embedded Controllers", "Physiological Measurements and Biomedical Instrumentation Lab",
                "Scientific and Analytical Instrumentation", "Signal Conditioning and Data Acquisition Circuits",
                "Signals and Systems"};
    }

    private void Medical_Electronics_V() {
        subjectArr = new String[]{"Control Systems", "Diagnostic and Therapeutic Equipment’s Lab",
                "Diagnostic and Therapeutic Equipment’s", "Digital Signal Processing", "ENVIRONMENTAL STUDIES",
                "Rehabilitation Engineering", "Signal Conditioning Circuits and Data Acquisition Lab",
                "Technological Innovation Management and Entrepreneurship", "VLSI Design"};
    }

    private void Medical_Electronics_VI() {
        subjectArr = new String[]{"Analog and Digital Communication Systems", "Biomedical Transducers and Instrumentation",
                "Hospital Design, Planning & Management", "Internship", "JAVA Programming Lab", "JAVA Programming", "Medical Electronics Design",
                "Medical Image Processing Lab", "Medical Image Processing", "Medical Imaging Systems", "Medical Physics",
                "Mini Project", "OPEN ELECTIVE - A", "Rehabilitation Engineering", "Virtual Bio-Instrumentation"};
    }

    private void Medical_Electronics_VII() {
        subjectArr = new String[]{"ARM Processor Lab", "ARM Processor", "Biomechanics and Biodynamics", "Biomedical DSP Lab",
                "Biomedical Digital Signal Processing Secondary", "Biomedical Digital Signal Processing", "Biometric Systems",
                "Biostatistics", "Database Management System in Healthcare", "Ergonomics", "Internet of Things", "Internship",
                "Lasers and Optical Fibers in Medicine", "Medical Image Processing", "Medical Informatics and Expert Systems Secondary",
                "Medical Informatics and Expert Systems", "OPEN ELECTIVE - B", "Project Work Phase-1"};
    }

    private void Medical_Electronics_VIII() {
        subjectArr = new String[]{"Artificial Intelligence and Machine Learning", "Bio-MEMS", "Biomaterials and Artificial Organs}",
                "Computer Communication Networks in Healthcare", "Internship", "Medical Imaging Systems", "Project Work Phase-2",
                "Technical Seminar"};
    }

    private void Mining_Engineering_III2021() {
        subjectArr = new String[]{"Mathematics Course (Common to all)", "Drilling and Blasting", "Mining Geology", "Elements of Mining Engineering", "Computer Aided Mining Drawing Lab",
                "Social Connect and Responsibility", "Kannada/Constitution", "Ability Enhancement Course - III"};
    }


    private void Mining_Engineering_III() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – I", "Aadalitha Kannada", "CONSTITUTION OF INDIA, PROFESSIONAL ETHICS AND CYBER LAW (CPC)",
                "DRILLING AND BLASTING", "ELEMENTS OF MINING ENGINEERING", "MECHANICS OF MATERIALS", "MINE SURVEYING – I LABORATORY",
                "MINE SURVEYING – I", "MINERALOGY AND PETROLOGY LABORATORY", "MINERALOGY, PETROLOGY AND STRATIGRAPHY",
                "TRANSFORM CALCULUS, FOURIER SERIES AND NUMERICAL TECHNIQUES", "Vyavaharika Kannada"};
    }

    private void Mining_Engineering_IV2021() {
        subjectArr = new String[]{"Probability and Statistics", "Rock Mechanics", "Mining Machinery", "Mine Surveying", "Biology For Engineers", "Mine Surveying Laboratory", "Kannada/Constitution",
                "Ability Enhancement Course- IV", "Universal Human Values", "Inter/Intra Institutional Internship"};
    }

    private void Mining_Engineering_IV() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – II", "COMPLEX ANALYSIS, PROBABILITY AND STATISTICAL METHODS", "GEOLOGY FOR MINING ENGINEERS LAB",
                "GEOLOGY FOR MINING ENGINEERS", "MINE SURVEYING – II LABORATORY", "MINE SURVEYING-II", "MINING MACHINERY", "THERMODYNAMICS AND FLUID MECHANICS",
                "UNDERGROUND METAL MINING"};
    }

    private void Mining_Engineering_V2021() {
        subjectArr = new String[]{"Surface Mining", "Mineral Processing", "Underground Coal Mining", "Mine Ventilation", "Mine Ventilation Laboratory", "Research Methodology & Intellectual Property Rights",
                "Environmental Studies", "Ability Enhancement Course-V"};
    }

    private void Mining_Engineering_V() {
        subjectArr = new String[]{"ENVIRONMENTAL STUDIES", "MINE ELECTRICAL ENGINEERING LABORATORY", "MINE ELECTRICAL ENGINEERING",
                "MINE MANAGEMENT", "MINE VENTILATION", "ROCK MECHANICS LAB", "ROCK MECHANICS", "SURFACE MINING", "UNDERGROUND COAL MINING"};
    }

    private void Mining_Engineering_VI2021() {
        subjectArr = new String[]{"Mine Management", "Mine System Engineering", "Underground Metal Mining",
                "Open Pit Slope Analysis and Design", "Mine Environmental Engineering", "Introduction to Mining",
                "Computer Application in Mining Lab", "Mini Project", "Innovation/Entrepreneurship /Societal Internship"};
    }

    private void Mining_Engineering_VI() {
        subjectArr = new String[]{"ENVIRONMENTAL MANAGEMENT IN SURFACE MINES", "GROUND CONTROL", "INTERNSHIP",
                "MINE ENVIRONMENTAL ENGINEERING", "MINE VENTILATION AND ENVIRONMENT LABORATORY", "MINERAL PROCESSING & FUEL TECHNOLOGY",
                "MINERAL PROCESSING LABORATORY", "MINI PROJECT", "SURFACE MINE PLANNING & DESIGN", "TUNNELING ENGINEERING",
                "UNDERGROUND MINE PLANNING AND DESIGN", "UNDERGROUND SPACE TECHNOLOGY"};
    }

    private void Mining_Engineering_VII2021() {
        subjectArr = new String[]{"Mine Legislation and Safety", "Mineral Economics",
                "Underground Mine Planning and Design", "Advanced Mine Ventilation ", "Mine Geo-statistics", "Dimensional Stone Mining",
                "Introduction to Mine Surveying", "Introduction to Rock Breakage", "Project work"};
    }

    private void Mining_Engineering_VII() {
        subjectArr = new String[]{"COMPUTER APPLICATION IN MINING LAB", "COMPUTER APPLICATION IN MINING", "INDUSTRIAL SAFETY ENGINEERING",
                "MINE OPTIMIZATION LABORATORY", "MINE SYSTEMS ENGINEERING", "MINERAL ECONOMICS", "NUMERICAL MODELLING AND INSTRUMENTATION IN ROCK MECHANICS",
                "OCCUPATIONAL HEALTH & GENERAL SAFETY", "OPEN PIT SLOPE ANALYSIS AND DESIGN", "PROJECT MANAGEMENT", "PROJECT WORK PHASE - 1"};
    }

    private void Mining_Engineering_VIII() {
        subjectArr = new String[]{"COAL BED METHANE", "DIMENSIONAL STONE MINING", "MINE LEGISLATION", "MINING GEOSTATISTICS",
                "PROJECT WORK PHASE -II", "TECHNICAL SEMINAR"};
    }


    //todo nano_tech scheme 2021 not available
    private void Nano_Technology_III() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – I", "Aadalitha Kannada", "BASICS OF MATERIAL SCIENCE",
                "Constitution of India, Professional Ethics and Cyber Law (CPC)", "DIGITAL ELECTRONICS LAB",
                "FOUNDATIONS OF NANOSCALE SCIENCE AND TECHNOLOGY", "FUNDAMENTALS OF BIOSCIENCE", "PHYSICAL AND CHEMICAL PRINCIPLES OF NANOTECHNOLOGY",
                "SIMULATION AND MODELLING LAB", "SYNTHESIS AND PROCESSING OF NANOMATERIALS", "TRANSFORM CALCULUS, FOURIER SERIES AND NUMERICAL TECHNIQUES",
                "Vyavaharika Kannada"};
    }

    private void Nano_Technology_IV() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – II", "APPLICATIONS OF NANOTECHNOLOGY", "BIOCHEMISTRY AND MICROBIOLOGY LAB",
                "BIOCHEMISTRY AND MICROBIOLOGY", "COMPLEX ANALYSIS, PROBABILITY AND STATISTICAL METHODS", "ELECTRONIC INSTRUMENTATION LAB",
                "ELECTRONIC INSTRUMENTS AND MEASUREMENTS", "ENGINEERING MATERIALS AND SURFACE COATING", "MATERIAL SCIENCE AND ENGINEERING"};
    }

    private void Nano_Technology_V() {
        subjectArr = new String[]{"CHARACTERIZATION AND MEASUREMENT LAB", "CHARACTERIZATION TECHNIQUES", "ENVIRONMENTAL STUDIES",
                "MANAGEMENT AND ENTREPRENEURSHIP", "MICRO FLUIDICS AND NANO FLUIDS", "NANO-PYTHON PROGRAMMING LANGUAGE FOR AUTOMATION",
                "NANOMATERIALS SYNTHESIS LAB", "QUANTUM MECHANICS AND SIMULATION TECHNIQUES", "SYNTHESIS OF NANOMATERIALS"};
    }

    private void Nano_Technology_VI() {
        subjectArr = new String[]{"BIOMA TERIALS", "COMPOSITES AND THEIR APPLICATIONS", "INTERNSHIP", "INTRODUCTION TO NANOSCIENCE AND NANOTECHNOLOGY",
                "MECHANICAL OPERATIONS", "MEMS AND NEMS", "MEMS SIMULATION LAB", "MINI PROJECT", "NANO-PHOTONICS", "NANOMATERIAL SURFACE CHARACTERIZATION AND THIN FILM LAB",
                "NANOMATERIALS AND THEIR APPLICATIONS", "NANOMATERIALS SYNTHESIS AND CHARACTERIZATION TECHNIQUES", "SURFACE SCIENCE AND THIN FILM TECHNOLOGY"};
    }

    private void Nano_Technology_VII() {
        subjectArr = new String[]{"APPLICATIONSOF NANOTECHNOLOGY IN ELECTRONICS", "FUNDAMENTALS OF THERMODYNAMICS", "GREEN NANOTECHNOLOGY",
                "MOLECULAR BIOLOGY AND GENETIC ENGINEERING LAB", "MOLECULAR BIOLOGY AND GENETIC ENGINEERING", "MOSFETS AND DIGITAL CIRCUITS",
                "NANO-ELECTRONICS", "NANO-TRIBOLOGY AND FRACTURE MECHANICS", "NANODEVICES AND APPLICATIONS", "NANOMATERIALS FOR CONSTRUCTION AND ENVIRONMENTAL APPLICATIONS",
                "NANOTECHNOLOGY IN AGRICULTURE AND FOOD PROCESSING", "NANOTECHNOLOGY IN BIOMEDICAL ENGINEERING", "PROJECT WORK PHASE - 1"};
    }

    private void Nano_Technology_VIII() {
        subjectArr = new String[]{"BIO-NANOTECHNOLOGY", "DIGITAL SYSTEMS DESIGN", "MICROCONTROLLERS AND INTERFACE",
                "NANO TOXICOLOGY", "PROJECT WORK PHASE -II", "TECHNICAL SEMINAR"};
    }


    //todo petro chem scheme 2021 not available
    private void Petrochem_Engineering_III() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – I", "Aadalitha Kannada", "CHEMICAL PROCESS CALCULATIONS",
                "CONSTITUTION OF INDIA, PROFESSIONAL ETHICS AND CYBER LAW (CPC)", "INSTRUMENTAL METHODS OF CHEMICAL ANALYSIS",
                "INTRODUCTION TO PETROCHEMICAL ENGINEERING", "MOMENTUM TRANSFER LABORATORY", "MOMENTUM TRANSFER",
                "PHYSICAL, ORGANIC AND INORGANIC CHEMISTRY", "TRANSFORM CALCULUS, FOURIER SERIES AND NUMERICAL TECHNIQUES",
                "Vyavaharika Kannada"};
    }

    private void Petrochem_Engineering_IV() {
        subjectArr = new String[]{"ADDITIONAL MATHEMATICS – II", "CHEMICAL ENGINEERING DRAWING LABORATORY", "CHEMICAL ENGINEERING THERMODYNAMICS",
                "COMPLEX ANALYSIS, PROBABILITY AND STATISTICAL METHODS", "CONSTITUTION OF INDIA, PROFESSIONAL ETHICS AND CYBER LAW (CPC)",
                "HEAT TRANSFER LABORATORY", "PETROLEUM REFINERY ENGINEERING", "PROCESS HEAT TRANSFER", "RENEWABLE ENERGY RESOURCES AND SYSTEMS",
                "TECHNOLOGY OF INTERMEDIATE PETROCHEMICALS"};
    }

    private void Petrochem_Engineering_V() {
        subjectArr = new String[]{"ENVIRONMENTAL STUDIES", "FUNDAMENTALS OF PETROLEUM GEOLOGY", "GEOLOGY LABORATORY",
                "MANAGEMENT AND ENTREPRENEURSHIP", "MASS TRANSFER OPERATIONS LABORATORY", "MASS TRANSFER OPERATIONS",
                "POLYMER SCIENCE AND TECHNOLOGY", "RESERVOIR ENGINEERING", "WELL DRILLING EQUIPMENT AND OPERATION"};
    }

    private void Petrochem_Engineering_VI() {
        subjectArr = new String[]{"BIOCHEMICAL ENGINEERING", "CHEMICAL REACTION ENGINEERING LABORATORY", "CHEMICAL REACTION ENGINEERING",
                "MATERIALS SCIENCE ENGINEERING", "MINI-PROJECT", "NATURAL GAS PROCESSING", "PETROLEUM TESTING LABORATORY", "PETROLEUM TRANSPORTATION ENGINEERING",
                "PHARMACEUTICAL TECHNOLOGY", "PROBABILITY AND STATISTICS", "PROCESS EQUIPMENT DESIGN AND DRAWING", "RESERVOIR ROCKS AND FLUID PROPERTIES"};
    }

    private void Petrochem_Engineering_VII() {
        subjectArr = new String[]{"COMPUTER APPLICATIONS LABORATORY", "ENVIRONMENTAL SCIENCE AND SOLID WASTE MANAGEMENT", "GREEN CHEMISTRY",
                "MODERN SEPARATION TECHNIQUES", "ONSHORE AND OFFSHORE ENGINEERING AND TECHNOLOGY", "OPTIMIZATION TECHNIQUES FOR PROCESS INDUSTRIES",
                "PETROLEUM CORROSION TECHNOLOGY", "PROCESS CONTROL AND INSTRUMENTATION", "PROCESS CONTROL LABORATORY", "PROCESS ENGINEERING AND PLANT DESIGN",
                "PROCESS MODELING AND SIMULATION", "PROFESSIONAL ETHICS IN ENGINEERING", "PROJECT WORK PHASE-1", "INTERNSHIP", "RESEARCH METHODOLOGY"};
    }

    private void Petrochem_Engineering_VIII() {
        subjectArr = new String[]{"PETROLEUM ECONOMICS", "PILOT PLANT AND SCALE UP METHODS",
                "PROJECT WORK PHASE-2", "RISK ASSESSMENT AND SAFETY ENGINEERING", "TRANSPORT PHENOMENA"};
    }
}
