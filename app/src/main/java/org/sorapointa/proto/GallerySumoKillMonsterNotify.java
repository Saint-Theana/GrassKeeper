package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GallerySumoKillMonsterNotify {
    @Tag(tag=4) public Integer killNormalMonsterNum = null;
    @Tag(tag=7) public Integer score = null;
    @Tag(tag=14) public Integer killEliteMonsterNum = null;
    @Tag(tag=11) public Integer galleryId = null;
}
