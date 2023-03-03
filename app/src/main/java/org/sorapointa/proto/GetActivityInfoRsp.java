package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ActivityInfo.*;
import org.sorapointa.proto.ActivityInfo;
import org.sorapointa.proto.Uint32Pair.*;
import org.sorapointa.proto.Uint32Pair;

public class GetActivityInfoRsp {
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
    @Tag(tag=5) public List<ActivityInfo> activityInfoList = new ArrayList<>();
    @Tag(tag=11) public List<Integer> activatedSaleIdList = new ArrayList<>();
    @Tag(tag=10) public List<Uint32Pair> disableTransferPointInteractionList = new ArrayList<>();
}
