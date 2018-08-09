package cn.xiaojii.cashgift.interactor;

import java.util.List;

/**
 * @author dmrfcoder
 * @date 2018/8/9
 */

public interface IFriendsAndRelativesInteractor {
    public interface UpdateFarViewListener {
        /**
         * 监听更新数据失败
         */
        void onUpdateViewError();

        /**
         * 监听更新数据成功
         *
         * @param dataList
         */
        void onUpdateViewSuccess(List dataList);

    }

    /**
     * 刷新视图
     * @param updateViewListener
     */
    void updateView(UpdateFarViewListener updateViewListener);



    /**
     * 初始化数据并刷新视图
     * @param dataList
     */
    void initData(List dataList, UpdateFarViewListener updateFarViewListener);


}
