package growithbig.technest.scheduledtask.AdapterManager;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import growithbig.technest.scheduledtask.Model.CurrentTaskDataitems;
import growithbig.technest.scheduledtask.R;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.MyNotificationHolder> {

    private LayoutInflater inflater;
    List<CurrentTaskDataitems> subscriptionDataItemsList;
    Intent nextIntent;
    Context mcontext;
    CurrentTaskDataitems category_Position;
    String id = null;
    String title = null;
    private final String CATEGORY_PREFERENCE = "UserCategory";
    int selected_position = 0;
    private ImageView im;
    int selectedPosition = -1;
    RecyclerViewClickListener customizedClick;
    private Context con;
    private String dt;


    public TransactionAdapter(List<CurrentTaskDataitems> hs, Context con) {
        this.mcontext = con;
        this.subscriptionDataItemsList = hs;

    }


    public void setOnItemClickListener(RecyclerViewClickListener itemClickListener) {
        customizedClick = itemClickListener;

    }

    @Override
    public MyNotificationHolder onCreateViewHolder(ViewGroup parent, int i) {
        inflater = LayoutInflater.from(mcontext);
        View vw = inflater.inflate(R.layout.items_paymentdone, parent, false);
        final MyNotificationHolder holder = new MyNotificationHolder(vw);
//        vw.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                customizedClick.onItemClick(v,holder.getPosition());
//            }
//        });

        return holder;
    }

    @Override
    public void onBindViewHolder(final MyNotificationHolder myHolder, final int position) {

        category_Position = subscriptionDataItemsList.get(position);
//        if (selectedPosition == position) {
//            HolderOnTariffselected(myHolder);
//
//        } else {
//            HolderOntariffbyDefault(myHolder);
//            myHolder.mView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    selectedPosition = position;
//                    notifyDataSetChanged();
//                //    ((SubscriptionplansActivity)con).findViewById(R.id.btn_continue).setBackgroundColor(Color.parseColor("#ffcc11"));
//                }
//            });
//        }

        myHolder.medicineHeading.setText("Client Name: "+category_Position.getClientname());
 //       myHolder.deliver_street.setText("Contact No. "+category_Position.getClient_installation());
        myHolder.tv_trans_ClientPhoneno.setText("Contact No. "+category_Position.getClient_contactno());
        myHolder.tv_trans_payment_date.setText("Date: "+category_Position.getClient_landmark());
    }

//    private void HolderOntariffbyDefault(MyNotificationHolder myHolder) {
//        myHolder.mView.setBackgroundColor(Color.parseColor("#ffffff"));
//        myHolder.medicineHeading.setTextColor(Color.parseColor("#7f7474"));
//        myHolder.medicine_price.setTextColor(Color.parseColor("#fb5b5b"));
//    }
//
//    private void HolderOnTariffselected(MyNotificationHolder myHolder) {
//        myHolder.mView.setBackgroundResource(R.drawable.bg_paymentplan_gradient);
//        myHolder.medicineHeading.setTextColor(Color.parseColor("#0aa9b5"));
//        myHolder.medicine_price.setTextColor(Color.parseColor("#0aa9b5"));
//    }

    @Override
    public int getItemCount() {
        return subscriptionDataItemsList.size();
    }

    public class MyNotificationHolder extends RecyclerView.ViewHolder {

        TextView medicineHeading;
        TextView medicine_price;
        TextView medicinecount_Pills;
        TextView medicinecount_min;
        TextView deliver_street;
        TextView deliver_landmark;
        TextView tv_trans_payment_date;
        TextView tv_trans_ClientPhoneno;
        LinearLayout ll_detail_layout;

        ImageView im;
        View mView;

        public MyNotificationHolder(View itemView) {
            super(itemView);
//            itemView.setOnClickListener(this);

            medicineHeading = (TextView) itemView.findViewById(R.id.tv_trans_clientname);
            deliver_street = (TextView) itemView.findViewById(R.id.tv_trans_payment_status);
            deliver_landmark = (TextView) itemView.findViewById(R.id.tv_trans_ClientPhoneno);
            tv_trans_payment_date = (TextView) itemView.findViewById(R.id.tv_trans_payment_date);
            tv_trans_ClientPhoneno = (TextView) itemView.findViewById(R.id.tv_trans_ClientPhoneno);
//            ll_detail_layout = (LinearLayout) itemView.findViewById(R.id.ll_servicerequest_detail_layout);

            mView = itemView;
//
//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    if (customizedClick != null) {
//                        int position = getAdapterPosition();
//                        if (position != RecyclerView.NO_POSITION) {
//                            customizedClick.onClick(position);
//                        }
//                    }
//                }
//            });
        }

//        @Override
//        public void onClick(View v) {
//
////            int itemPosition = getAdapterPosition();
//            category_Position = subscriptionDataItemsList.get(getAdapterPosition());
//            // view.setBackgroundResource(selected_position == position ? R.drawable.mybus:R.color.colorPrimary);
//
//            //     view.setBackgroundColor(selected_position == position ? Color.GREEN: Color.DKGRAY);
////                view.setBackgroundResource(R.drawable.mybusto);
////            view.setBackgroundColor(selected_position == position ? Color.GREEN : Color.DKGRAY);
//
////            SharedPreferences savenb = con.getSharedPreferences("Category", Context.MODE_PRIVATE);
////            SharedPreferences.Editor editNtb = savenb.edit();
////            editNtb.putString("category_id", id);
////            editNtb.putString("category_name", title);
////            editNtb.commit();
////            nextIntent = new Intent(getContext(), ListOfCompaniesActivity.class);
////            nextIntent.putExtra("category_name", home_Items.getCategory_name());
////            nextIntent.putExtra("category_id", home_Items.getCategory_id());
////            startActivity(nextIntent);
//            Toast.makeText(v.getContext(),"Clicked"+category_Position.getPrice(),Toast.LENGTH_LONG).show();
//            v.findViewById(R.id.btn_continue).setBackgroundColor(Color.RED);
//        }
    }

    public interface RecyclerViewClickListener {
        void onClick(int position);
    }
}