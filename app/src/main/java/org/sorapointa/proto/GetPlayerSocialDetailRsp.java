package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SocialDetail.*;
import org.sorapointa.proto.SocialDetail;

public class GetPlayerSocialDetailRsp {
    @Tag(tag=12) public SocialDetail detailData = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
}
