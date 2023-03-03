package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.UgcMusicBriefInfo.*;
import org.sorapointa.proto.UgcMusicBriefInfo;
import org.sorapointa.proto.UgcType.*;
import org.sorapointa.proto.UgcType;

public class GetUgcBriefInfoRsp {
    @Tag(tag=3) public Long ugcGuid = null;
    @Tag(tag=11) public Integer ugcType = null;
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public UgcMusicBriefInfo musicBriefInfo = null;
}
