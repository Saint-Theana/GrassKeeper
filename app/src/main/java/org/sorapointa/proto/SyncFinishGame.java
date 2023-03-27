package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SyncFinishGame {
    @Tag(tag=1) public Boolean isWin = null;
    @Tag(tag=5) public Long serverGameTime = null;
    @Tag(tag=8) public Boolean isStopGallery = null;
}
