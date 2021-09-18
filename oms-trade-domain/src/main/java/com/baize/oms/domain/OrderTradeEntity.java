package com.baize.oms.domain;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 订单交易表
 *
 * @author quleiming
 * @date 2021-09-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("order_trade")
@ApiModel(value="OrderTradeEntity对象", description="订单交易表")
public class OrderTradeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主订单编号，唯一键")
    @TableId(value = "order_no", type = IdType.AUTO)
    private String orderNo;

    @ApiModelProperty(value = "外部交易号")
    private String outerOrderNo;

    @ApiModelProperty(value = "交易状态 WAIT_PAY：待支付，WAIT_SEND：待发货，PART_SEND：部分发货，WAIT_RECEIVE：已发货，WAIT_WRITE_OFF：待核销，SUCCESS：已完成，CLOSED：已关闭")
    private String tradeStatus;

    @ApiModelProperty(value = "交易状态描述，和trade_status对应关系。WAIT_PAY：等待买家付款，定金预售描述：定金待付、等待尾款支付开始、尾款待付，WAIT_SEND：等待卖家发货，即：买家已付款，PART_SEND: 卖家只发部分货，即：卖家部分发货，WAIT_RECEIVE: 等待买家确认收货，即：卖家已发货，WAIT_WRITE_OFF: 等待卖家核销，SUCCESS：买家已签收以及订单成功，CLOSED：交易关闭")
    private String tradeStatusStr;

    @ApiModelProperty(value = "销售模式 common：普通; TUAN：团购; SHANGOU:闪购;HAITAO:海淘;SOP:京东SOP;JITX:JITX;TCG:同城购;ZENG:赠品")
    private String bizMode;

    @ApiModelProperty(value = "预售模式 common：普通; presale：预售;waypresale：在途预售;")
    private String presaleMode;

    @ApiModelProperty(value = "交易类型 1：款到发货 2：货到付款 3：担保交易")
    private Integer transType;

    @ApiModelProperty(value = "订单类型 0，正常订单 1，补发订单 2，换货订单")
    private Integer orderType;

    @ApiModelProperty(value = "用户ID")
    private String userId;

    @ApiModelProperty(value = "渠道编码")
    private String channelCode;

    @ApiModelProperty(value = "渠道名称")
    private String channelName;

    @ApiModelProperty(value = "店铺编码")
    private String shopCode;

    @ApiModelProperty(value = "店铺名称")
    private String shopName;

    @ApiModelProperty(value = "门店ID")
    private String storeCode;

    @ApiModelProperty(value = "门店名称")
    private String storeName;

    @ApiModelProperty(value = "换货单关联的原订单号")
    private String exchangeOriginalNo;

    @ApiModelProperty(value = "换货单关联退单号")
    private String exchangeRefundNo;

    @ApiModelProperty(value = "关联原单号（换单或复制订单使用）")
    private String originalOrderNo;

    @ApiModelProperty(value = "线上线下类型 online:线上;offline:线下")
    private String onlineOffline;

    @ApiModelProperty(value = "商品总金额")
    private BigDecimal itemFee;

    @ApiModelProperty(value = "优惠金额")
    private BigDecimal discount;

    @ApiModelProperty(value = "运费")
    private BigDecimal freight;

    @ApiModelProperty(value = "订单总金额")
    private BigDecimal totalFee;

    @ApiModelProperty(value = "已付款金额")
    private BigDecimal paidFee;

    @ApiModelProperty(value = "礼品卡/储值卡抵扣金额")
    private BigDecimal deductionFee;

    @ApiModelProperty(value = "使用积分金额")
    private BigDecimal usePointsFee;

    @ApiModelProperty(value = "使用积分数量")
    private Integer usePointsNum;

    @ApiModelProperty(value = "优惠券/码编号")
    private String couponId;

    @ApiModelProperty(value = "优惠券金额")
    private BigDecimal couponFee;

    @ApiModelProperty(value = "应付款总金额 ")
    private BigDecimal payableFee;

    @ApiModelProperty(value = "商品数量")
    private Integer num;

    @ApiModelProperty(value = "缺货状态 0:未缺货; 1:分配缺货；2：物流缺货")
    private Integer lackType;

    @ApiModelProperty(value = "促销信息列表含有促销id，促销名称，促销有效期等")
    private String promotions;

    @ApiModelProperty(value = "买家留言")
    private String buyerMessage;

    @ApiModelProperty(value = "卖家备注")
    private String sellerMessage;

    @ApiModelProperty(value = "打星1~5星或者插旗")
    private Integer flag;

    @ApiModelProperty(value = "取消原因编码")
    private String closeCode;

    @ApiModelProperty(value = "取消原因描述")
    private String closeReason;

    @ApiModelProperty(value = "订单种类 1：零售")
    private Integer orderCategory;

    @ApiModelProperty(value = "0:未占用;1:已占用")
    private Integer preeOccupy;

    @ApiModelProperty(value = "收货人的姓名")
    private String consignee;

    @ApiModelProperty(value = "国家名称")
    private String country;

    @ApiModelProperty(value = "省份名称")
    private String province;

    @ApiModelProperty(value = "城市名称")
    private String city;

    @ApiModelProperty(value = "地区名称")
    private String district;

    @ApiModelProperty(value = "详细地址")
    private String address;

    @ApiModelProperty(value = "邮政编码")
    private String zipcode;

    @ApiModelProperty(value = "电话号码")
    private String tel;

    @ApiModelProperty(value = "手机号码")
    private String mobile;

    @ApiModelProperty(value = "电子邮件")
    private String email;

    @ApiModelProperty(value = "最佳送货时间")
    private String bestTime;

    @ApiModelProperty(value = "用户选择的配送方式编码")
    private String priorityExpressCode;

    @ApiModelProperty(value = "用户选择的配送方式的名称")
    private String priorityExpressName;

    @ApiModelProperty(value = "配送方式（物流类型）， 0:快递发货; 1:到店自提; 2:同城配送; 9:无需发货（虚拟商品订单）")
    private Integer expressType;

    @ApiModelProperty(value = "订单支付类型 0:默认值,未支付; 1:微信自有支付; 2:支付宝wap; 5:财付通; 7:代付;  15:赠品; 16:优惠兑换; 17:自动付货款;  25:储值卡;  35:储值卡（会员余额）; 106:储值卡（线下场景使用）; 201:现金;202:组合支付")
    private Integer payType;

    @ApiModelProperty(value = "是否自提 0:否;1:是")
    private Integer isCac;

    @ApiModelProperty(value = "店员工号")
    private String assistantId;

    @ApiModelProperty(value = "订单完成标志(0:下单未完成,-1待处理，1:下单完成)")
    private Integer orderFinished;

    @ApiModelProperty(value = "发票信息JSON 包含 taxpayer_id:买家税号;raise_type:抬头类型:personal个人,enterprise 企业;invoice_name:抬头名称;invoice_detail_type:发票详情类型:itemCategory 商品类别,itemDetail 商品明细; invoice_status: 0：未开票 1：已开票 2：开票失败;invoice_url:发票pdf地址")
    private String invoiceInfo;

    @ApiModelProperty(value = "0：未开票 1：已开票 2：开票失败")
    private Integer invoiceStatus;

    @ApiModelProperty(value = "订单退款状态； 0:未退款，1:部分退款中（瞬时状态），2:部分退款成功，3:全额退款中（瞬时状态）4:全额退款成功。")
    private Integer refundState;

    @ApiModelProperty(value = "订单扩展信息")
    private String orderExtra;

    @ApiModelProperty(value = "生成时间")
    private Date orderTime;

    @ApiModelProperty(value = "付款时间")
    private Date payTime;

    @ApiModelProperty(value = "审核时间")
    private Date auditTime;

    @ApiModelProperty(value = "发货时间")
    private Date consignTime;

    @ApiModelProperty(value = "签收时间")
    private Date receivedTime;

    @ApiModelProperty(value = "完成时间")
    private Date finishTime;

    @ApiModelProperty(value = "过期时间")
    private Date expiredTime;

    @ApiModelProperty(value = "创建时间")
    private Date createdDate;

    @ApiModelProperty(value = "创建人")
    private String createdUser;

    @ApiModelProperty(value = "更新时间(用户对订单的任何修改都会更新此字段)")
    private Date modifiedDate;

    @ApiModelProperty(value = "更新人")
    private String modifiedUser;


}
