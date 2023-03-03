package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BigTalentPointConvertRsp {
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public Long avatarGuid = null;
}
