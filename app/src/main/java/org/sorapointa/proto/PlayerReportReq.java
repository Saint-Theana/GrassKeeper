package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ReportReasonType.*;
import org.sorapointa.proto.ReportReasonType;

public class PlayerReportReq {
    @Tag(tag=12) public Integer reason = null;
    @Tag(tag=8) public String content = null;
    @Tag(tag=5) public Integer targetHomeModuleId = null;
    @Tag(tag=6) public String targetHomeModuleName = null;
    @Tag(tag=14) public Integer targetUid = null;
}
