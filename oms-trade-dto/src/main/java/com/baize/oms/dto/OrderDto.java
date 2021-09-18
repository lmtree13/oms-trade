package com.baize.oms.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author quleiming
 * @version 1.0
 * @date 2021/7/21 9:28
 **/
@Data
public class OrderDto implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主订单编号，唯一键")
    private String orderNo;

    @ApiModelProperty(value = "订单销售模式 common：普通; presale：预售;waypresale：在途预售; group：团购")
    private String bizMode;

    @ApiModelProperty(value = "活动类型 0: 没有活动,1: 特卖订单, 2: 闪购订单,3: 手工导单,4: 拼团,5: 积分兑换,6: 秒杀,7: 优惠套餐,8: 赠品,9: 门店订单,10: 会员折扣,11: 限时折扣,12: 扫码优惠,13: 加价购,14: 满减送,15: 订单返现,16: 第二件半价,17:积分抵现")
    private Integer activityType;

    @ApiModelProperty(value = "线上线下类型 online:线上;offline:线下")
    private String onlineOffline;

    @ApiModelProperty(value = "平台 wx:微信小程序; iosapp:ios_app; andirdapp:andird_app;H5:H5; other:其他")
    private String platform;

    @ApiModelProperty(value = "交易类型 1:款到发货;2:货到付款;3:担保交易")
    private Integer transType;

    @ApiModelProperty(value = "订单类型 0:正常订单;1:补发订单; 2:换货订单")
    private Integer orderType;

    @ApiModelProperty(value = "换货单关联的原订单号")
    private String exchangeOriginalNo;

    @ApiModelProperty(value = "换货单关联退单号")
    private String exchangeRefundNo;

    @ApiModelProperty(value = "关联原单号（换单或复制订单使用）")
    private String originalOrderNo;

    @ApiModelProperty(value = "外部交易号")
    private String outerOrderNo;

    @ApiModelProperty(value = "用户ID")
    private String userId;

    @ApiModelProperty(value = "订单由某广告带来的广告id")
    private String fromAd;

    @ApiModelProperty(value = "参加了哪些促销编号")
    private String prIds;

    @ApiModelProperty(value = "参加促销的名字(多个)")
    private String prName;

    @ApiModelProperty(value = "能获得推荐分成的用户id")
    private String parentId;

    @ApiModelProperty(value = "CPS来源")
    private String cpsCode;

    @ApiModelProperty(value = "运费")
    private BigDecimal postFee;

    @ApiModelProperty(value = "应付款总金额 ")
    private BigDecimal totalPayable;

    @ApiModelProperty(value = "商品总金额")
    private BigDecimal itemFee;

    @ApiModelProperty(value = "商品数量")
    private Integer num;

    @ApiModelProperty(value = "订单总金额")
    private BigDecimal totalFee;

    @ApiModelProperty(value = "已付款金额")
    private BigDecimal paidFee;

    @ApiModelProperty(value = "礼品卡/储值卡抵扣金额")
    private BigDecimal deductionFee;

    @ApiModelProperty(value = "优惠券/码编号")
    private String couponId;

    @ApiModelProperty(value = "优惠券金额")
    private BigDecimal couponFee;

    @ApiModelProperty(value = "订单商品折扣")
    private BigDecimal discount;

    @ApiModelProperty(value = "积分金额")
    private BigDecimal pointsFee;

    @ApiModelProperty(value = "积分数量")
    private Integer pointsNum;

    @ApiModelProperty(value = "订单附言，由用户提交订单前填写")
    private String postscript;

    @ApiModelProperty(value = "订单种类 1：零售 2：物资领用 3：其它出库 4: C2b定制; 6: 分销")
    private Integer orderCategory;

    @ApiModelProperty(value = "单据组织：物资领用时，成本中心编码；其它出库时，承运商编码")
    private String invoicesOrganization;

    @ApiModelProperty(value = "订单标记 POS:全流通;YHJ:云货架;B2C:线上订单;SHANGOU:闪购;HAITAO:海淘;SOP:京东SOP;JITX:JITX;TCG:同城购")
    private String orderMark;

    @ApiModelProperty(value = "0:未占用;1:已占用")
    private Integer preeOccupy;

    @ApiModelProperty(value = "支付方式	 0:默认值,未支付; 1:微信; 2:支付宝; 3:储值卡; 4:邦付宝; 5:平台支付 202:组合支付")
    private Integer payType;

    @ApiModelProperty(value = "运费付款方式 01:到付;02:自付")
    private String wayPaymentFreight;

    @ApiModelProperty(value = "订单完成标志(0:下单未完成,-1待处理，1:下单完成)")
    private Integer orderFinished;

    @ApiModelProperty(value = "订单是否评论 0:未评论; 1:已评论")
    private Integer isReview;

    @ApiModelProperty(value = "免邮类型 0:不免邮;1:单品免邮;2:整单免邮;3:满足规则免邮;")
    private Integer freePostType;

    @ApiModelProperty(value = "免邮券卡号")
    private String freePostCard;

    @ApiModelProperty(value = "免邮前邮费金额")
    private BigDecimal freePostFee;

    @ApiModelProperty(value = "用户身份证号码")
    private String userCardNo;

    @ApiModelProperty(value = "用户ID（用来查询海淘收件人身份信息）")
    private String userAddressId;

    @ApiModelProperty(value = "订单扩展信息")
    private String orderExtra;

    @ApiModelProperty(value = "订单标签列表")
    private String orderLabel;

    @ApiModelProperty(value = "订单生成时间")
    private Date orderTime;

    @ApiModelProperty(value = "付款时间")
    private Date payTime;

    @ApiModelProperty(value = "发货时间")
    private Date consignTime;

    @ApiModelProperty(value = "团购确认时间")
    private Date confirmTime;

    @ApiModelProperty(value = "完成(关闭)时间")
    private Date finishTime;

    @ApiModelProperty(value = "锁定时间")
    private Date lockTime;

    @ApiModelProperty(value = "通知收款时间")
    private Date noticeTime;

    @ApiModelProperty(value = "拆单时间")
    private Date splitTime;

    @ApiModelProperty(value = "创建时间")
    private Date created;

    @ApiModelProperty(value = "创建人")
    private String createdBy;

    @ApiModelProperty(value = "交易修改时间(用户对订单的任何修改都会更新此字段)")
    private Date modified;

    @ApiModelProperty(value = "更新人")
    private String modifiedBy;

    private OrderAddDto orderAddDto;

    private OrderExtDto orderExtDto;

    private OrderInvDto orderInvDto;

    private OrderShopDto orderShopDto;

    private  OrderStatusDto orderStatusDto;

    private List<OrderItemDto> orderItemDtos;
}
