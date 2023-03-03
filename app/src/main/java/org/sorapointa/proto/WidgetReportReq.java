package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WidgetReportReq {
    @Tag(tag=5) public Boolean isClearSkyCrystalHint = null;
    @Tag(tag=14) public Boolean isClientCollect = null;
    @Tag(tag=13) public Boolean isClearHint = null;
    @Tag(tag=15) public Integer materialId = null;
}
