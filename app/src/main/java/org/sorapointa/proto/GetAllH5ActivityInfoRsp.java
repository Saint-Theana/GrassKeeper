package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.H5ActivityInfo.*;
import org.sorapointa.proto.H5ActivityInfo;

public class GetAllH5ActivityInfoRsp {
    @Tag(tag=15) public List<H5ActivityInfo> h5ActivityInfoList = new ArrayList<>();
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=12) public Integer clientRedDotTimestamp = null;
}
