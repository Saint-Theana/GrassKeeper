package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WinterCampAcceptItemResultInfo.*;
import org.sorapointa.proto.WinterCampAcceptItemResultInfo;

public class WinterCampAcceptAllGiveItemRsp {
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public List<WinterCampAcceptItemResultInfo> acceptItemResultInfo = new ArrayList<>();
}
