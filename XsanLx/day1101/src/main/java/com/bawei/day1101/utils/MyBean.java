package com.bawei.day1101.utils;

import java.util.List;

/*
 *author:郭昊坤
 *date:2019/11/1
 *function:*/public class MyBean {


    /**
     * result : [{"categoryName":"女鞋","shoppingCartList":[{"commodityId":27,"commodityName":"休闲马衔扣保暖绒里棉鞋懒人鞋毛毛鞋平底女雪地靴女短靴子豆豆鞋女鞋","count":1,"pic":"http://172.17.8.100/images/small/commodity/nx/ddx/3/1.jpg","price":139},{"commodityId":32,"commodityName":"唐狮女鞋冬季女鞋休闲鞋子女士女鞋百搭帆布鞋女士休闲鞋子女款板鞋休闲女鞋帆布鞋","count":2,"pic":"http://172.17.8.100/images/small/commodity/nx/fbx/1/1.jpg","price":88},{"commodityId":29,"commodityName":"秋冬新款平底毛毛豆豆鞋加绒单鞋一脚蹬懒人鞋休闲","count":1,"pic":"http://172.17.8.100/images/small/commodity/nx/ddx/5/1.jpg","price":278}]},{"categoryName":"美妆护肤","shoppingCartList":[{"commodityId":17,"commodityName":"化妆镜","count":7,"pic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/7/1.jpg","price":31},{"commodityId":6,"commodityName":"轻柔系自然裸妆假睫毛","count":4,"pic":"http://172.17.8.100/images/small/commodity/mzhf/cz/4/1.jpg","price":39},{"commodityId":15,"commodityName":"玻儿精灵美妆蛋一个","count":1,"pic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/5/1.jpg","price":6},{"commodityId":11,"commodityName":"盒装葫芦粉扑美妆蛋化妆海绵","count":1,"pic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/1/1.jpg","price":9},{"commodityId":13,"commodityName":"贝览得美妆蛋","count":2,"pic":"http://172.17.8.100/images/small/commodity/mzhf/mzgj/3/1.jpg","price":44}]}]
     * message : 查詢成功
     * status : 0000
     */

    private String message;
    private String status;
    private List<ResultBean> result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * categoryName : 女鞋
         * shoppingCartList : [{"commodityId":27,"commodityName":"休闲马衔扣保暖绒里棉鞋懒人鞋毛毛鞋平底女雪地靴女短靴子豆豆鞋女鞋","count":1,"pic":"http://172.17.8.100/images/small/commodity/nx/ddx/3/1.jpg","price":139},{"commodityId":32,"commodityName":"唐狮女鞋冬季女鞋休闲鞋子女士女鞋百搭帆布鞋女士休闲鞋子女款板鞋休闲女鞋帆布鞋","count":2,"pic":"http://172.17.8.100/images/small/commodity/nx/fbx/1/1.jpg","price":88},{"commodityId":29,"commodityName":"秋冬新款平底毛毛豆豆鞋加绒单鞋一脚蹬懒人鞋休闲","count":1,"pic":"http://172.17.8.100/images/small/commodity/nx/ddx/5/1.jpg","price":278}]
         */

        private String categoryName;
        private List<ShoppingCartListBean> shoppingCartList;

        public String getCategoryName() {
            return categoryName;
        }

        public void setCategoryName(String categoryName) {
            this.categoryName = categoryName;
        }

        public List<ShoppingCartListBean> getShoppingCartList() {
            return shoppingCartList;
        }

        public void setShoppingCartList(List<ShoppingCartListBean> shoppingCartList) {
            this.shoppingCartList = shoppingCartList;
        }

        public static class ShoppingCartListBean {
            /**
             * commodityId : 27
             * commodityName : 休闲马衔扣保暖绒里棉鞋懒人鞋毛毛鞋平底女雪地靴女短靴子豆豆鞋女鞋
             * count : 1
             * pic : http://172.17.8.100/images/small/commodity/nx/ddx/3/1.jpg
             * price : 139
             */

            private String commodityId;
            private String commodityName;
            private String count;
            private String pic;
            private String price;

            public String getCommodityId() {
                return commodityId;
            }

            public void setCommodityId(String commodityId) {
                this.commodityId = commodityId;
            }

            public String getCommodityName() {
                return commodityName;
            }

            public void setCommodityName(String commodityName) {
                this.commodityName = commodityName;
            }

            public String getCount() {
                return count;
            }

            public void setCount(String count) {
                this.count = count;
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }
        }
    }
}
