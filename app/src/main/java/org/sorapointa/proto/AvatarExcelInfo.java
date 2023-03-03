package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarExcelInfo {
    @Tag(tag=1) public Long prefabPathHash = null;
    @Tag(tag=2) public Long prefabPathRemoteHash = null;
    @Tag(tag=3) public Long controllerPathHash = null;
    @Tag(tag=4) public Long controllerPathRemoteHash = null;
    @Tag(tag=5) public Long combatConfigHash = null;
}
