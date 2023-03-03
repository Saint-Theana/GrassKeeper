package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeGroupRecord.*;
import org.sorapointa.proto.HomeGroupRecord;

public class HomeGetGroupRecordRsp {
    @Tag(tag=7) public HomeGroupRecord groupRecord = null;
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=1) public Integer recordType = null;
}
