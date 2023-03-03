package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WearEquipReq {
    @Tag(tag=7) public Long equipGuid = null;
    @Tag(tag=5) public Long avatarGuid = null;
}
