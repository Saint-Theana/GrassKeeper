package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeoffEquipRsp {
    @Tag(tag=9) public Long avatarGuid = null;
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
    @Tag(tag=10) public Integer slot = null;
}
