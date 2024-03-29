package com.nbird.vtusgpacalculator.Adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.nbird.vtusgpacalculator.Data.PortionSubjectList;
import com.nbird.vtusgpacalculator.Models.SchemeHolder;
import com.nbird.vtusgpacalculator.Modes;
import com.nbird.vtusgpacalculator.R;
import com.nbird.vtusgpacalculator.SubjectsList;
import com.nbird.vtusgpacalculator.SubjectsList2021;


import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    private Context mContext;
    private List<Modes> mData;


    private InterstitialAd mInterstitialAd;


    public RecyclerViewAdapter(Context mContext, List<Modes> mData, InterstitialAd mInterstitialAd) {
        this.mContext = mContext;
        this.mData = mData;
        this.mInterstitialAd = mInterstitialAd;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.asset_cardview, parent, false);

        return new MyViewHolder(view);

    }


    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        switch (position) {
            case 2:
                holder.head.setTextSize(15);
                holder.dis.setTextSize(11);
        }

        holder.head.setText(mData.get(position).getTitle());
        try {
            holder.anim.setAnimation(mData.get(position).getThumbnail());
        } catch (Exception e) {
            e.printStackTrace();
        }

        holder.dis.setText(mData.get(position).getDis());


        /*
          FLAG : 0 -> CGPA CALCULATOR
          FLAG : 1 -> PORTION
        */


        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] scheme = {"2018", "2021"};
                switch (position) {
                    case 0:
                        String[] branchArr2018 = {"CSE", "ISE", "ECE", "ME", "EEE", "ETE", "CIVIL", "BTE"};
                        String[] semArr = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII"};
                        branchAndSemesterAlertDialog(v, scheme, branchArr2018, semArr, 0);
                        break;
                    case 1:
                        String[] branchPortionArr = {"Aeronautical Engineering", "Aerospace Engineering",
                                "Architecture", "Biomedical Engineering", "Biotechnology",
                                "Chemical Engineering", "Civil Engineering", "Computer Science & Engineering",
                                "Electrical & Electronics Engineering", "Electronics & Communication Engineering",
                                "Electronics & Instrumentation Engineering", "Electronics & Telecommunication Engineering",
                                "Industrial & Production Engineering", "Information Science & Engineering",
                                "Manufacturing Science & Engineering", "Marine Engineering", "Mechanical Engineering", "Mechatronics", "Medical Electronics",
                                "Mining Engineering", "Nano Technology", "Petrochem Engineering"};
                        String[] semPortionArr = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII"};
                        branchAndSemesterAlertDialog(v, scheme, branchPortionArr, semPortionArr, 1);
                        break;
                    case 2:
                        cgpaCalculatorAlertDialog(v);
                        break;
                    case 3:
                        selectSchemeView(v);
                        break;
                    case 4:
                        Intent browserIntenttos = new Intent(Intent.ACTION_VIEW, Uri.parse("https://results.vtu.ac.in/JAEcbcs/index.php"));
                        mContext.startActivity(browserIntenttos);
                        break;
                    case 5:
                        percentageAlertDialog(v);
                        break;
                }

            }
        });


    }


    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView head;
        LottieAnimationView anim;
        TextView dis;
        CardView cardView;


        public MyViewHolder(View itemView) {
            super(itemView);

            head = (TextView) itemView.findViewById(R.id.head);
            anim = (LottieAnimationView) itemView.findViewById(R.id.anim);
            dis = (TextView) itemView.findViewById(R.id.dis);
            cardView = (CardView) itemView.findViewById(R.id.cardview_id);

        }


    }


    private void portionSubjectsAlertDialog(View v, int selectedScheme, int selectedBranch, int selectedSem) {
        AlertDialog.Builder builder = new AlertDialog.Builder(mContext, R.style.AlertDialogTheme);

        final View view1 = LayoutInflater.from(mContext).inflate(R.layout.dialog_scheme_list, (ConstraintLayout) v.findViewById(R.id.layoutDialogContainer));
        builder.setView(view1);
        builder.setCancelable(true);

        RecyclerView recyclerViewSubjects = (RecyclerView) view1.findViewById(R.id.recyclerview);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext);
        linearLayoutManager.setOrientation(recyclerViewSubjects.VERTICAL);
        recyclerViewSubjects.setLayoutManager(linearLayoutManager);

        final AlertDialog alertDialog = builder.create();
        SubjectAdapter categoryAdapter = new SubjectAdapter(mContext, datasubjectAdder(selectedScheme, selectedBranch, selectedSem + 1), selectedScheme, selectedBranch, selectedSem + 1, alertDialog, mInterstitialAd);
        recyclerViewSubjects.setAdapter(categoryAdapter);


        if (alertDialog.getWindow() != null) {
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        try {
            alertDialog.show();
        } catch (Exception e) {

        }


    }


    private String[] datasubjectAdder(int selectedScheme, int selectedBranch, int selectedSem) {

        PortionSubjectList portionSubjectList = new PortionSubjectList(selectedScheme, selectedSem, selectedBranch);

        return portionSubjectList.getSubjectArr();

    }

    private void selectSchemeView(View v) {

        AlertDialog.Builder builder = new AlertDialog.Builder(mContext, R.style.AlertDialogTheme);

        final View view1 = LayoutInflater.from(mContext).inflate(R.layout.dialog_scheme, v.findViewById(R.id.layoutDialogContainer));

        builder.setView(view1);
        builder.setCancelable(true);


        Spinner schemeSpinner = (Spinner) view1.findViewById(R.id.spinnerScheme);

        String[] schemeArr = {"2018", "2021"};
        int[] selectedScheme = {0};

        ArrayAdapter<String> schemeAdapter = new ArrayAdapter<String>(mContext, android.R.layout.simple_spinner_item, schemeArr);

        schemeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        schemeSpinner.setAdapter(schemeAdapter);


        schemeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedScheme[0] = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final AlertDialog alertDialog = builder.create();
        if (alertDialog.getWindow() != null) {
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        try {
            alertDialog.show();
        } catch (Exception e) {

        }


        Button submit = view1.findViewById(R.id.submitButton);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.cancel();
                schemeListView(v, selectedScheme[0]);
            }
        });
    }


    private void schemeListView(View v, int scheme) {
        AlertDialog.Builder builder = new AlertDialog.Builder(mContext, R.style.AlertDialogTheme);

        final View view1 = LayoutInflater.from(mContext).inflate(R.layout.dialog_scheme_list, (ConstraintLayout) v.findViewById(R.id.layoutDialogContainer));
        builder.setView(view1);
        builder.setCancelable(true);

        RecyclerView recyclerViewBranch = (RecyclerView) view1.findViewById(R.id.recyclerview);
        List<SchemeHolder> branchList = new ArrayList<>();


        final AlertDialog alertDialog = builder.create();
        if (alertDialog.getWindow() != null) {
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        try {
            alertDialog.show();
        } catch (Exception e) {

        }
        if (scheme == 0) {
            setModesList(branchList);
        } else {
            setModesList2021(branchList);
        }

        SchemeAdapter myAdapter = new SchemeAdapter(mContext, branchList, alertDialog, mInterstitialAd, scheme);
        recyclerViewBranch.setLayoutManager(new GridLayoutManager(mContext, 2));
        recyclerViewBranch.setAdapter(myAdapter);

    }

    private void setModesList2021(List<SchemeHolder> modesList) {
        modesList.add(new SchemeHolder(R.drawable.first_year, "First Year"));
        modesList.add(new SchemeHolder(R.drawable.physics_cycle, "Engineering Physics Lab"));
        modesList.add(new SchemeHolder(R.drawable.lab, "Engineering Chemistry Lab"));

        modesList.add(new SchemeHolder(R.drawable.aeronautical_engineering, "Aeronautical Engineering"));
        modesList.add(new SchemeHolder(R.drawable.aerospace_engineering, "Aerospace Engineering"));
        modesList.add(new SchemeHolder(R.drawable.architecture, "Architecture"));
        modesList.add(new SchemeHolder(R.drawable.automobile_engineering, "Automobile Engineering"));
        modesList.add(new SchemeHolder(R.drawable.biomedical_engineering, "Biomedical Engineering"));
        modesList.add(new SchemeHolder(R.drawable.biotechnology, "Biotechnology"));
        modesList.add(new SchemeHolder(R.drawable.chemistry, "Chemical Engineering"));
//        modesList.add(new SchemeHolder(R.drawable.civil_engineering, "Civil Engineering"));
        modesList.add(new SchemeHolder(R.drawable.computer_science_engineering, "Computer Science & Engineering"));
        modesList.add(new SchemeHolder(R.drawable.electrical_electronics_engineering, "Electrical & Electronics Engineering"));
        modesList.add(new SchemeHolder(R.drawable.electronics_communication_engineering, "Electronics & Communication Engineering"));

        modesList.add(new SchemeHolder(R.drawable.electronics_telecommunication_engineering, "Electronics & Telecommunication Engineering"));
        modesList.add(new SchemeHolder(R.drawable.industrial_production_engineering, "Industrial & Production Engineering"));
        modesList.add(new SchemeHolder(R.drawable.industrial_engineering_management, "Industrial Engineering & Management"));
        modesList.add(new SchemeHolder(R.drawable.information_science_engineering, "Information Science & Engineering"));
//        modesList.add(new SchemeHolder(R.drawable.manufacturing_engineering, "Manufacturing Science & Engineering"));
        modesList.add(new SchemeHolder(R.drawable.marine_engineering, "Marine Engineering"));
        modesList.add(new SchemeHolder(R.drawable.mechanical_engineering, "Mechanical Engineering"));
        modesList.add(new SchemeHolder(R.drawable.mecha, "Mechatronics"));
//        modesList.add(new SchemeHolder(R.drawable.medical_electronics, "Medical Electronics"));
//        modesList.add(new SchemeHolder(R.drawable.mining_engineering, "Mining Engineering"));
//        modesList.add(new SchemeHolder(R.drawable.nano_technology, "Nano Technology"));
//        modesList.add(new SchemeHolder(R.drawable.petrochemical, "Petrochem Engineering"));
    }


    private void setModesList(List<SchemeHolder> modesList) {

        modesList.add(new SchemeHolder(R.drawable.first_year, "First Year"));
        modesList.add(new SchemeHolder(R.drawable.physics_cycle, "Engineering Physics Lab"));
        modesList.add(new SchemeHolder(R.drawable.lab, "Engineering Chemistry Lab"));

        modesList.add(new SchemeHolder(R.drawable.aeronautical_engineering, "Aeronautical Engineering"));
        modesList.add(new SchemeHolder(R.drawable.aerospace_engineering, "Aerospace Engineering"));
        modesList.add(new SchemeHolder(R.drawable.architecture, "Architecture"));
        modesList.add(new SchemeHolder(R.drawable.automobile_engineering, "Automobile Engineering"));
        modesList.add(new SchemeHolder(R.drawable.biomedical_engineering, "Biomedical Engineering"));
        modesList.add(new SchemeHolder(R.drawable.biotechnology, "Biotechnology"));
        modesList.add(new SchemeHolder(R.drawable.chemistry, "Chemical Engineering"));
        modesList.add(new SchemeHolder(R.drawable.civil_engineering, "Civil Engineering"));
        modesList.add(new SchemeHolder(R.drawable.computer_science_engineering, "Computer Science & Engineering"));
        modesList.add(new SchemeHolder(R.drawable.electrical_electronics_engineering, "Electrical & Electronics Engineering"));
        modesList.add(new SchemeHolder(R.drawable.electronics_communication_engineering, "Electronics & Communication Engineering"));

        modesList.add(new SchemeHolder(R.drawable.electronics_telecommunication_engineering, "Electronics & Telecommunication Engineering"));
        modesList.add(new SchemeHolder(R.drawable.industrial_production_engineering, "Industrial & Production Engineering"));
        modesList.add(new SchemeHolder(R.drawable.industrial_engineering_management, "Industrial Engineering & Management"));
        modesList.add(new SchemeHolder(R.drawable.information_science_engineering, "Information Science & Engineering"));
        modesList.add(new SchemeHolder(R.drawable.manufacturing_engineering, "Manufacturing Science & Engineering"));
        modesList.add(new SchemeHolder(R.drawable.marine_engineering, "Marine Engineering"));
        modesList.add(new SchemeHolder(R.drawable.mechanical_engineering, "Mechanical Engineering"));
        modesList.add(new SchemeHolder(R.drawable.mecha, "Mechatronics"));
        modesList.add(new SchemeHolder(R.drawable.medical_electronics, "Medical Electronics"));
        modesList.add(new SchemeHolder(R.drawable.mining_engineering, "Mining Engineering"));
        modesList.add(new SchemeHolder(R.drawable.nano_technology, "Nano Technology"));
        modesList.add(new SchemeHolder(R.drawable.petrochemical, "Petrochem Engineering"));

    }


    private void percentageAlertDialog(View v) {


        AlertDialog.Builder builder = new AlertDialog.Builder(mContext, R.style.AlertDialogTheme);

        final View view1 = LayoutInflater.from(mContext).inflate(R.layout.dialog_percentage_input, (ConstraintLayout) v.findViewById(R.id.layoutDialogContainer));
        builder.setView(view1);
        builder.setCancelable(true);


        TextInputEditText t1 = (TextInputEditText) view1.findViewById(R.id.t1);
        Button submitButton = (Button) view1.findViewById(R.id.submitButton);


        final AlertDialog alertDialog = builder.create();
        if (alertDialog.getWindow() != null) {
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        try {
            alertDialog.show();
        } catch (Exception e) {

        }


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float[] cgpa = new float[1];


                if (t1.getText().toString().equals("")) {
                    t1.setError("Fields Cannot Be Empty");
                } else if (Float.parseFloat(t1.getText().toString()) > 10f) {
                    t1.setError("Field Is Invalid! Should Be Less Than Or Equala To 10");
                } else {
                    alertDialog.dismiss();
                    cgpa[0] = Float.parseFloat(t1.getText().toString());
                    resultDisplay(v, 3, cgpa);

                }


            }
        });


    }

    private void cgpaCalculatorAlertDialog(View v) {


        AlertDialog.Builder builder = new AlertDialog.Builder(mContext, R.style.AlertDialogTheme);

        final View view1 = LayoutInflater.from(mContext).inflate(R.layout.dialog_cgpa_entry, (ConstraintLayout) v.findViewById(R.id.layoutDialogContainer));
        builder.setView(view1);
        builder.setCancelable(true);

        TextInputEditText et1 = (TextInputEditText) view1.findViewById(R.id.t1);
        TextInputEditText et2 = (TextInputEditText) view1.findViewById(R.id.t2);
        TextInputEditText et3 = (TextInputEditText) view1.findViewById(R.id.t3);
        TextInputEditText et4 = (TextInputEditText) view1.findViewById(R.id.t4);
        TextInputEditText et5 = (TextInputEditText) view1.findViewById(R.id.t5);
        TextInputEditText et6 = (TextInputEditText) view1.findViewById(R.id.t6);
        TextInputEditText et7 = (TextInputEditText) view1.findViewById(R.id.t7);
        TextInputEditText et8 = (TextInputEditText) view1.findViewById(R.id.t8);

        Button submitButton = (Button) view1.findViewById(R.id.submitButton);


        final AlertDialog alertDialog = builder.create();
        if (alertDialog.getWindow() != null) {
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        try {
            alertDialog.show();
        } catch (Exception e) {

        }

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                float[] arr = new float[9];
                arr[0] = valueGetterForCGPA(et1);
                arr[1] = valueGetterForCGPA(et2);
                arr[2] = valueGetterForCGPA(et3);
                arr[3] = valueGetterForCGPA(et4);
                arr[4] = valueGetterForCGPA(et5);
                arr[5] = valueGetterForCGPA(et6);
                arr[6] = valueGetterForCGPA(et7);
                arr[7] = valueGetterForCGPA(et8);


                if (arr[0] == 0) {
                    et1.setError("Fields Cannot Be Empty");
                } else {
                    alertDialog.cancel();
                    resultDisplay(v, 2, arr);
                }


            }
        });
    }


    private void resultDisplay(View v, int i, float[] arr) {
        AlertDialog.Builder builder = new AlertDialog.Builder(mContext, R.style.AlertDialogTheme);

        final View view1 = LayoutInflater.from(mContext).inflate(R.layout.dialog_result_display, (ConstraintLayout) v.findViewById(R.id.layoutDialogContainer));
        builder.setView(view1);
        builder.setCancelable(false);


        TextView resultText = (TextView) view1.findViewById(R.id.resultText);
        Button cancelButton = (Button) view1.findViewById(R.id.cancelButton);
        Button reButton = (Button) view1.findViewById(R.id.reButton);
        TextView headText = (TextView) view1.findViewById(R.id.headText);


        if (i == 2) {
            headText.setText("Your CGPA");
            float sum = 0;
            int div = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != 0) {
                    div++;
                    sum = sum + arr[j];
                }

            }

            sum = sum / div;
            String formattedString = String.format("%.02f", sum);

            resultText.setText(formattedString);

        } else if (i == 3) {
            headText.setText("Your Percentage");
            float per = (float) (arr[0] * 9.5);
            String formattedString = String.format("%.02f", per);
            resultText.setText(formattedString + "%");
        } else if (i == 1) {
            headText.setText("Your SGPA");
            String formattedString = String.format("%.02f", arr[0]);
            resultText.setText(formattedString);
        }


        final AlertDialog alertDialog = builder.create();
        if (alertDialog.getWindow() != null) {
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        try {
            alertDialog.show();
        } catch (Exception e) {

        }


        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mInterstitialAd.setAdListener(new AdListener() {
                    public void onAdClosed() {
                        super.onAdClosed();
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                        alertDialog.dismiss();
                    }

                });

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                    return;
                }


                alertDialog.dismiss();
            }
        });


        reButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
                String[] scheme = {"2018", "2021"};
                mInterstitialAd.setAdListener(new AdListener() {
                    public void onAdClosed() {
                        super.onAdClosed();
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                        if (i == 2) {
                            cgpaCalculatorAlertDialog(v);
                        } else if (i == 3) {
                            percentageAlertDialog(v);
                        } else if (i == 1) {
                            String[] branchArr = {"CSE", "ISE", "ECE", "ME", "EEE", "ETE", "CIVIL", "BTE"};
                            String[] semArr = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII"};
                            branchAndSemesterAlertDialog(v, scheme, branchArr, semArr, 0);
                        }
                    }

                });

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                    return;
                }


                if (i == 2) {
                    cgpaCalculatorAlertDialog(v);
                } else if (i == 3) {
                    percentageAlertDialog(v);
                } else if (i == 1) {
                    String[] branchArr = {"CSE", "ISE", "ECE", "ME", "EEE", "ETE", "CIVIL", "BTE"};
                    String[] semArr = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII"};
                    branchAndSemesterAlertDialog(v, scheme, branchArr, semArr, 0);
                }
            }
        });


    }


    private float valueGetterForCGPA(TextInputEditText et) {
        float marks;

        String m = et.getText().toString();

        if (m.equals("")) {
            marks = 0;
        } else {
            marks = Float.parseFloat(m);
        }


        return marks;
    }

    private void branchAndSemesterAlertDialog(View v, String[] schemeArr, String[] branchArr, String[] semArr, int flag) {


        int[] selectedScheme = {0};
        int[] selectedBranch = {0};
        int[] selectedSem = {0};


        AlertDialog.Builder builder = new AlertDialog.Builder(mContext, R.style.AlertDialogTheme);

        final View view1 = LayoutInflater.from(mContext).inflate(R.layout.layout_sem_branch_select, (ConstraintLayout) v.findViewById(R.id.layoutDialogContainer));
        builder.setView(view1);
        builder.setCancelable(true);


        Spinner spinnerScheme = (Spinner) view1.findViewById(R.id.spinnerScheme);
        Spinner spinnerBranch = (Spinner) view1.findViewById(R.id.spinnerBranch);
        Spinner spinnerSem = (Spinner) view1.findViewById(R.id.spinnerSem);
        Button nextButton = (Button) view1.findViewById(R.id.nextButton);


        ArrayAdapter<String> schemeAdapter = new ArrayAdapter<String>(mContext, android.R.layout.simple_spinner_item, schemeArr);
        ArrayAdapter<String> branchAdapter = new ArrayAdapter<String>(mContext, android.R.layout.simple_spinner_item, branchArr);
        ArrayAdapter<String> semAdapter = new ArrayAdapter<String>(mContext, android.R.layout.simple_spinner_item, semArr);

        schemeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerScheme.setAdapter(schemeAdapter);


        spinnerScheme.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedScheme[0] = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        branchAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerBranch.setAdapter(branchAdapter);


        spinnerBranch.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedBranch[0] = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinnerSem.setAdapter(semAdapter);
        spinnerSem.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedSem[0] = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final AlertDialog alertDialog = builder.create();
        if (alertDialog.getWindow() != null) {
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        try {
            alertDialog.show();
        } catch (Exception e) {

        }

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.cancel();
                if (flag == 0) {
                    marksEntryAlertDialog(v, selectedScheme[0], selectedBranch[0], selectedSem[0]);
                } else if (flag == 1) {
                    portionSubjectsAlertDialog(v, selectedScheme[0], selectedBranch[0], selectedSem[0]);
                }

            }
        });

    }


    private void marksEntryAlertDialog(View v, int selectedScheme, int selectedBranch, int selectedSem) {

        AlertDialog.Builder builder = new AlertDialog.Builder(mContext, R.style.AlertDialogTheme);

        final View view1 = LayoutInflater.from(mContext).inflate(R.layout.dialog_marks_entry, (ConstraintLayout) v.findViewById(R.id.layoutDialogContainer));
        builder.setView(view1);
        builder.setCancelable(true);


        TextInputEditText et1 = (TextInputEditText) view1.findViewById(R.id.t1);
        TextInputEditText et2 = (TextInputEditText) view1.findViewById(R.id.t2);
        TextInputEditText et3 = (TextInputEditText) view1.findViewById(R.id.t3);
        TextInputEditText et4 = (TextInputEditText) view1.findViewById(R.id.t4);
        TextInputEditText et5 = (TextInputEditText) view1.findViewById(R.id.t5);
        TextInputEditText et6 = (TextInputEditText) view1.findViewById(R.id.t6);
        TextInputEditText et7 = (TextInputEditText) view1.findViewById(R.id.t7);
        TextInputEditText et8 = (TextInputEditText) view1.findViewById(R.id.t8);
        TextInputEditText et9 = (TextInputEditText) view1.findViewById(R.id.t9);


        TextInputLayout e1 = (TextInputLayout) view1.findViewById(R.id.et1);
        TextInputLayout e2 = (TextInputLayout) view1.findViewById(R.id.et2);
        TextInputLayout e3 = (TextInputLayout) view1.findViewById(R.id.et3);
        TextInputLayout e4 = (TextInputLayout) view1.findViewById(R.id.et4);
        TextInputLayout e5 = (TextInputLayout) view1.findViewById(R.id.et5);
        TextInputLayout e6 = (TextInputLayout) view1.findViewById(R.id.et6);
        TextInputLayout e7 = (TextInputLayout) view1.findViewById(R.id.et7);
        TextInputLayout e8 = (TextInputLayout) view1.findViewById(R.id.et8);
        TextInputLayout e9 = (TextInputLayout) view1.findViewById(R.id.et9);

        Button submitButton = (Button) view1.findViewById(R.id.submitButton);


        String[] subjectArr = new String[9];
        int[] creditsArr = new int[9];

        // {"CSE", "ISE", "ECE", "ME", "EEE", "TE", "CIVIL","BTE"};
       /*CSE=0
       ISE=1
       ECE=2
       ME=3
       EEE=4
       TE=5
       CIVIL=6
       BTE=7    */

        if (selectedScheme == 1) {

            SubjectsList2021 subjectsList2021 = new SubjectsList2021(selectedSem, selectedBranch);
            subjectsList2021.start();

            subjectArr = subjectsList2021.getSubjectArr();
            creditsArr = subjectsList2021.getSemsArr();

        } else {

            SubjectsList subjectsList = new SubjectsList(selectedSem, selectedBranch);
            subjectsList.start();

            subjectArr = subjectsList.getSubjectArr();
            creditsArr = subjectsList.getSemsArr();

        }

        int length = subjectArr.length;

        TextInputLayout[] etArr = new TextInputLayout[]{e1, e2, e3, e4, e5, e6, e7, e8, e9};

        TextInputEditText[] editTextArr = new TextInputEditText[]{et1, et2, et3, et4, et5, et6, et7, et8, et9};

        for (int i = 0; i < length; i++) {

            etArr[i].setHint(subjectArr[i]);
        }

        if (length != 9) {
            for (int i = length; i < 9; i++) {
                etArr[i].setVisibility(View.GONE);
            }
        }


        final AlertDialog alertDialog = builder.create();
        if (alertDialog.getWindow() != null) {
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        try {
            alertDialog.show();
        } catch (Exception e) {

        }


        int[] finalCreditsArr = creditsArr;
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (etChecker(editTextArr, length)) {
                    alertDialog.dismiss();

                    float[] arrFloat = new float[length];

                    for (int i = 0; i < length; i++) {
                        arrFloat[i] = Float.parseFloat(editTextArr[i].getText().toString());
                    }

                    float sumation = 0;
                    int sgpaSum = 0;

                    for (int i = 0; i < length; i++) {
                        int yo = 0;
                        if (arrFloat[i] <= 100 && arrFloat[i] >= 90) {
                            yo = 10;
                        } else if (arrFloat[i] <= 90 && arrFloat[i] >= 80) {
                            yo = 9;
                        } else if (arrFloat[i] <= 80 && arrFloat[i] >= 70) {
                            yo = 8;
                        } else if (arrFloat[i] <= 70 && arrFloat[i] >= 60) {
                            yo = 7;
                        } else if (arrFloat[i] <= 60 && arrFloat[i] >= 50) {
                            yo = 6;
                        } else if (arrFloat[i] <= 50 && arrFloat[i] >= 40) {
                            yo = 5;
                        } else if (arrFloat[i] <= 40 && arrFloat[i] >= 30) {
                            yo = 4;
                        } else if (arrFloat[i] <= 30 && arrFloat[i] >= 20) {
                            yo = 3;
                        } else if (arrFloat[i] <= 20 && arrFloat[i] >= 10) {
                            yo = 2;
                        } else if (arrFloat[i] <= 10 && arrFloat[i] >= 0) {
                            yo = 1;
                        }
                        sumation = sumation + (yo * finalCreditsArr[i]);
                        sgpaSum = sgpaSum + finalCreditsArr[i];
                    }

                    float sgpa = sumation / (sgpaSum);

                    float[] sgpaArr = new float[]{sgpa};

                    resultDisplay(v, 1, sgpaArr);
                }

            }
        });


    }


    private Boolean etChecker(TextInputEditText[] etArr, int length) {

        for (int i = 0; i < length; i++) {
            if (etArr[i].getText().toString().equals("")) {
                etArr[i].setError("Fields Cannot Be Empty");
                return false;
            }
        }

        for (int i = 0; i < length; i++) {
            if (Float.parseFloat(etArr[i].getText().toString()) > 100) {
                etArr[i].setError("Fields Cannot Be Greater Than 100");
                return false;
            }
        }

        return true;

    }


}
