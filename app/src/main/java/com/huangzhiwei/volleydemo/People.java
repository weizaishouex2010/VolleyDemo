package com.huangzhiwei.volleydemo;

import java.util.List;

/**
 * Created by huangzhiwei on 16/3/9.
 */
public class People {

    /**
     * data : [{"position":"北京中医药大学东方医院 消化内科","createTime":"2016-01-13 11:08:55","birthday":"","loginTime":"","userIp":"","detail":"","sex":1,"weight":"","memo":"","state":1,"workYear":"","createBy":"","city":"","id":"a83bb4d7-0ce1-4a17-826d-c3b463e6e0c5","superAdmin":"","title":"肠胃专家","height":"","token":"","userId":"a83bb4d7-0ce1-4a17-826d-c3b463e6e0c5","age":"","province":"","departId":"","tokenTime":"","userName":"李军祥主任医师团队","attentionImg":"/upload/image/dc/avatar/619ad192-0e5f-4a2e-9182-5f3413b39c0e.jpg","idNumber":"","popularity":33,"fields":"","roleId":2,"updateBy":"","logoutCause":"","updateTime":"2016-03-09 10:25:46","userCode":"13901357666","instId":"","birthdayString":"","avatarNoRoot":"/upload/image/dc/avatar/ad62b724-f6a1-4afb-9291-9b18cc903d16.jpg","roleStr":"","loginCount":"","avatar":"/upload/image/dc/avatar/ad62b724-f6a1-4afb-9291-9b18cc903d16.jpg","deleted":0,"intro":"肠胃专家","pwd":"583AEA81133C1EDF0A8E1CEBD03C24F7","county":"","email":"","mobileNum":"13901357666","spread":1,"telephone":"","openId":""}]
     * success : true
     */

    private boolean success;
    /**
     * position : 北京中医药大学东方医院 消化内科
     * createTime : 2016-01-13 11:08:55
     * birthday :
     * loginTime :
     * userIp :
     * detail :
     * sex : 1
     * weight :
     * memo :
     * state : 1
     * workYear :
     * createBy :
     * city :
     * id : a83bb4d7-0ce1-4a17-826d-c3b463e6e0c5
     * superAdmin :
     * title : 肠胃专家
     * height :
     * token :
     * userId : a83bb4d7-0ce1-4a17-826d-c3b463e6e0c5
     * age :
     * province :
     * departId :
     * tokenTime :
     * userName : 李军祥主任医师团队
     * attentionImg : /upload/image/dc/avatar/619ad192-0e5f-4a2e-9182-5f3413b39c0e.jpg
     * idNumber :
     * popularity : 33
     * fields :
     * roleId : 2
     * updateBy :
     * logoutCause :
     * updateTime : 2016-03-09 10:25:46
     * userCode : 13901357666
     * instId :
     * birthdayString :
     * avatarNoRoot : /upload/image/dc/avatar/ad62b724-f6a1-4afb-9291-9b18cc903d16.jpg
     * roleStr :
     * loginCount :
     * avatar : /upload/image/dc/avatar/ad62b724-f6a1-4afb-9291-9b18cc903d16.jpg
     * deleted : 0
     * intro : 肠胃专家
     * pwd : 583AEA81133C1EDF0A8E1CEBD03C24F7
     * county :
     * email :
     * mobileNum : 13901357666
     * spread : 1
     * telephone :
     * openId :
     */

    private List<DataEntity> data;

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setData(List<DataEntity> data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public List<DataEntity> getData() {
        return data;
    }

    public static class DataEntity {
        private String position;
        private String createTime;
        private String birthday;
        private String loginTime;
        private String userIp;
        private String detail;
        private int sex;
        private String weight;
        private String memo;
        private int state;
        private String workYear;
        private String createBy;
        private String city;
        private String id;
        private String superAdmin;
        private String title;
        private String height;
        private String token;
        private String userId;
        private String age;
        private String province;
        private String departId;
        private String tokenTime;
        private String userName;
        private String attentionImg;
        private String idNumber;
        private int popularity;
        private String fields;
        private int roleId;
        private String updateBy;
        private String logoutCause;
        private String updateTime;
        private String userCode;
        private String instId;
        private String birthdayString;
        private String avatarNoRoot;
        private String roleStr;
        private String loginCount;
        private String avatar;
        private int deleted;
        private String intro;
        private String pwd;
        private String county;
        private String email;
        private String mobileNum;
        private int spread;
        private String telephone;
        private String openId;

        public void setPosition(String position) {
            this.position = position;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public void setLoginTime(String loginTime) {
            this.loginTime = loginTime;
        }

        public void setUserIp(String userIp) {
            this.userIp = userIp;
        }

        public void setDetail(String detail) {
            this.detail = detail;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public void setWeight(String weight) {
            this.weight = weight;
        }

        public void setMemo(String memo) {
            this.memo = memo;
        }

        public void setState(int state) {
            this.state = state;
        }

        public void setWorkYear(String workYear) {
            this.workYear = workYear;
        }

        public void setCreateBy(String createBy) {
            this.createBy = createBy;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setSuperAdmin(String superAdmin) {
            this.superAdmin = superAdmin;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public void setDepartId(String departId) {
            this.departId = departId;
        }

        public void setTokenTime(String tokenTime) {
            this.tokenTime = tokenTime;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public void setAttentionImg(String attentionImg) {
            this.attentionImg = attentionImg;
        }

        public void setIdNumber(String idNumber) {
            this.idNumber = idNumber;
        }

        public void setPopularity(int popularity) {
            this.popularity = popularity;
        }

        public void setFields(String fields) {
            this.fields = fields;
        }

        public void setRoleId(int roleId) {
            this.roleId = roleId;
        }

        public void setUpdateBy(String updateBy) {
            this.updateBy = updateBy;
        }

        public void setLogoutCause(String logoutCause) {
            this.logoutCause = logoutCause;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public void setUserCode(String userCode) {
            this.userCode = userCode;
        }

        public void setInstId(String instId) {
            this.instId = instId;
        }

        public void setBirthdayString(String birthdayString) {
            this.birthdayString = birthdayString;
        }

        public void setAvatarNoRoot(String avatarNoRoot) {
            this.avatarNoRoot = avatarNoRoot;
        }

        public void setRoleStr(String roleStr) {
            this.roleStr = roleStr;
        }

        public void setLoginCount(String loginCount) {
            this.loginCount = loginCount;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public void setDeleted(int deleted) {
            this.deleted = deleted;
        }

        public void setIntro(String intro) {
            this.intro = intro;
        }

        public void setPwd(String pwd) {
            this.pwd = pwd;
        }

        public void setCounty(String county) {
            this.county = county;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setMobileNum(String mobileNum) {
            this.mobileNum = mobileNum;
        }

        public void setSpread(int spread) {
            this.spread = spread;
        }

        public void setTelephone(String telephone) {
            this.telephone = telephone;
        }

        public void setOpenId(String openId) {
            this.openId = openId;
        }

        public String getPosition() {
            return position;
        }

        public String getCreateTime() {
            return createTime;
        }

        public String getBirthday() {
            return birthday;
        }

        public String getLoginTime() {
            return loginTime;
        }

        public String getUserIp() {
            return userIp;
        }

        public String getDetail() {
            return detail;
        }

        public int getSex() {
            return sex;
        }

        public String getWeight() {
            return weight;
        }

        public String getMemo() {
            return memo;
        }

        public int getState() {
            return state;
        }

        public String getWorkYear() {
            return workYear;
        }

        public String getCreateBy() {
            return createBy;
        }

        public String getCity() {
            return city;
        }

        public String getId() {
            return id;
        }

        public String getSuperAdmin() {
            return superAdmin;
        }

        public String getTitle() {
            return title;
        }

        public String getHeight() {
            return height;
        }

        public String getToken() {
            return token;
        }

        public String getUserId() {
            return userId;
        }

        public String getAge() {
            return age;
        }

        public String getProvince() {
            return province;
        }

        public String getDepartId() {
            return departId;
        }

        public String getTokenTime() {
            return tokenTime;
        }

        public String getUserName() {
            return userName;
        }

        public String getAttentionImg() {
            return attentionImg;
        }

        public String getIdNumber() {
            return idNumber;
        }

        public int getPopularity() {
            return popularity;
        }

        public String getFields() {
            return fields;
        }

        public int getRoleId() {
            return roleId;
        }

        public String getUpdateBy() {
            return updateBy;
        }

        public String getLogoutCause() {
            return logoutCause;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public String getUserCode() {
            return userCode;
        }

        public String getInstId() {
            return instId;
        }

        public String getBirthdayString() {
            return birthdayString;
        }

        public String getAvatarNoRoot() {
            return avatarNoRoot;
        }

        public String getRoleStr() {
            return roleStr;
        }

        public String getLoginCount() {
            return loginCount;
        }

        public String getAvatar() {
            return avatar;
        }

        public int getDeleted() {
            return deleted;
        }

        public String getIntro() {
            return intro;
        }

        public String getPwd() {
            return pwd;
        }

        public String getCounty() {
            return county;
        }

        public String getEmail() {
            return email;
        }

        public String getMobileNum() {
            return mobileNum;
        }

        public int getSpread() {
            return spread;
        }

        public String getTelephone() {
            return telephone;
        }

        public String getOpenId() {
            return openId;
        }
    }

    @Override
    public String toString() {
        return "People{" +
                "success=" + success +
                ", data=" + data.size() +
                '}';
    }
}
