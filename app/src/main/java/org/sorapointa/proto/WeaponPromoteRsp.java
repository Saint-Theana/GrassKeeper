package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WeaponPromoteRsp {
    @Tag(tag=3) public Long targetWeaponGuid = null;
    @Tag(tag=7) public Integer oldPromoteLevel = null;
    @Tag(tag=12) public Integer curPromoteLevel = null;
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
}
