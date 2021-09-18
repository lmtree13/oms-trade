package com.baize.oms.domain;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 订单明细表
 *
 * @author quleiming
 * @date 2021-09-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("order_item")
@ApiModel(value="OrderItemEntity对象", description="订单明细表")
public class OrderItemEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商品行号")
    @TableId(value = "item_no", type = IdType.AUTO)
    private String itemNo;

    @ApiModelProperty(value = "订单号")
    private String orderNo;

    @ApiModelProperty(value = "发货单号")
    private String deliNo;

    @ApiModelProperty(value = "实际配货仓库编码")
    private String actualWarehouse;

    @ApiModelProperty(value = "虚拟（合并）配货仓库编码")
    private String virtualWarehouse;

    @ApiModelProperty(value = "明细状态 0:正常;1:删除;2:AG退款;3:已取消;")
    private Integer itemStatus;

    @ApiModelProperty(value = "商品标题")
    private String title;

    @ApiModelProperty(value = "商品6位码")
    private String itemId;

    @ApiModelProperty(value = "11位码")
    private String skuId;

    @ApiModelProperty(value = "商品69码，国际码")
    private String barCode;

    @ApiModelProperty(value = "商品类型 0: 普通商品;")
    private Integer itemType;

    @ApiModelProperty(value = "商品数量")
    private Integer num;

    @ApiModelProperty(value = "销售价")
    private BigDecimal sellerPrc;

    @ApiModelProperty(value = "成交价")
    private BigDecimal tranPrc;

    @ApiModelProperty(value = "财务价")
    private BigDecimal settlePrc;

    @ApiModelProperty(value = "优惠")
    private BigDecimal discount;

    @ApiModelProperty(value = "红包金额")
    private BigDecimal couponPrc;

    @ApiModelProperty(value = "积分金额")
    private BigDecimal pointsPrc;

    @ApiModelProperty(value = "积分数量")
    private Integer pointsNum;

    @ApiModelProperty(value = "商品快照信息JSON 包含groupName：套装名称; sizeName:尺码名称; color_name:颜色名称; picPath:图片地址;promotionId:促销id;promotionName:促销名称;onBrandPrc:吊牌价")
    private String itemInfo;

    @ApiModelProperty(value = "赠品所属商品编码，赠品使用多个,分割")
    private String mainSkuId;

    @ApiModelProperty(value = "换货商品")
    private String exchangeSkuId;

    @ApiModelProperty(value = "品牌编码")
    private String brandCode;

    @ApiModelProperty(value = "店员工号")
    private String assistantId;

    @ApiModelProperty(value = "是否预售商品 0：否，1：是")
    private String isPreSale;

    @ApiModelProperty(value = "是否保护价商品 0：否，1：是")
    private String isProtect;

    @ApiModelProperty(value = "退款类型 none:没有;refund:退款;refundo:退货")
    private String refundType;

    @ApiModelProperty(value = "退款状态。可选值 NO_REFUND(无需退款) WAIT_SELLER_AGREE(买家已经申请退款，等待卖家同意) WAIT_BUYER_RETURN_GOODS(卖家已经同意退款，等待买家退货) WAIT_SELLER_CONFIRM_GOODS(买家已经退货，等待卖家确认收货) SELLER_REFUSE_BUYER(卖家拒绝退款) SELLER_AGREE_REFUND(卖家同意退款，等待平台退款） CLOSED(退款关闭) SUCCESS(退款成功)")
    private String refundStatus;

    @ApiModelProperty(value = "退单编号")
    private String refundNo;

    @ApiModelProperty(value = "售后商品数量")
    private Integer refundNum;

    @ApiModelProperty(value = "商家编码")
    private String bizCode;

    @ApiModelProperty(value = "物流状态 0:未发货; 1:已发货")
    private String expressState;

    @ApiModelProperty(value = "快递单号")
    private String expressNo;

    @ApiModelProperty(value = "外部交易号")
    private String oid;

    @ApiModelProperty(value = "占用库存数量")
    private Integer occNum;

    @ApiModelProperty(value = "预计发货时间")
    private String estimatedTime;

    @ApiModelProperty(value = "商品扩展信息")
    private String goodsExtra;


}
