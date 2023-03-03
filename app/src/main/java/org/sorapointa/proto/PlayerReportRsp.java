package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerReportRsp {
    @Tag(tag=11) public Integer cdTime = null;
    @Tag(tag=6) public Integer targetUid = null;
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
}
