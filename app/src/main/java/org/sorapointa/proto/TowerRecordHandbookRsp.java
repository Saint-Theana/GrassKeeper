package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.TowerMonthlyDetail.*;
import org.sorapointa.proto.TowerMonthlyDetail;

public class TowerRecordHandbookRsp {
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public List<TowerMonthlyDetail> monthlyDetailList = new ArrayList<>();
}
