package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RecordUsage.*;
import org.sorapointa.proto.RecordUsage;
import org.sorapointa.proto.UgcMusicBriefInfo.*;
import org.sorapointa.proto.UgcMusicBriefInfo;
import org.sorapointa.proto.UgcMusicRecord.*;
import org.sorapointa.proto.UgcMusicRecord;
import org.sorapointa.proto.UgcType.*;
import org.sorapointa.proto.UgcType;

public class GetUgcRsp {
    @Tag(tag=15) public Long ugcGuid = null;
    @Tag(tag=10) public Integer ugcType = null;
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public Integer ugcRecordUsage = null;
    @Tag(tag=4) public UgcMusicRecord musicRecord = null;
    @Tag(tag=1819) public UgcMusicBriefInfo musicBriefInfo = null;
}
