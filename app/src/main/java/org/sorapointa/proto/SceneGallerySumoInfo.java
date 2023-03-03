package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneGallerySumoInfo {
    @Tag(tag=2) public Integer score = null;
    @Tag(tag=15) public Integer killNormalMonsterNum = null;
    @Tag(tag=14) public Integer killEliteMonsterNum = null;
}
