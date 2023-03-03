package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.OpActivityInfo.*;
import org.sorapointa.proto.OpActivityInfo;

public class GetOpActivityInfoRsp {
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=7) public List<OpActivityInfo> opActivityInfoList = new ArrayList<>();
}
