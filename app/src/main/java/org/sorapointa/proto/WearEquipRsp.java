package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WearEquipRsp {
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=1) public Long equipGuid = null;
    @Tag(tag=7) public Long avatarGuid = null;
}
