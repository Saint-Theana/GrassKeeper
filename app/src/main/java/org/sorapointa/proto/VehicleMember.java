package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VehicleMember {
    @Tag(tag=1) public Integer uid = null;
    @Tag(tag=2) public Long avatarGuid = null;
    @Tag(tag=3) public Integer pos = null;
}
