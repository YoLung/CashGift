package cn.xiaojii.cashgift.interactor.inter.base;

import java.util.List;

import cn.xiaojii.cashgift.bean.fragment.ProjectBean;

/**
 * @author dmrfcoder
 * @date 2018/8/4
 */

public interface IBaseFragmentInteractor {

    public interface AddProjectListener {
        /**
         * 添加失败
         */
        void onAddProjectError();


        /**
         * 添加成功
         *
         * @param beanList
         *
         */
        void onAddProjectSuccess(List beanList);
    }


    /**
     * 增加数据
     *
     * @param projectBean
     */
    void addProject(ProjectBean projectBean, AddProjectListener addProjectListener);








}
