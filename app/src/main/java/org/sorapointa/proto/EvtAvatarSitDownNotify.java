package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtAvatarSitDownNotify {
    @Tag(tag=9) public Vector position = null;
    @Tag(tag=4) public Integer entityId = null;
    @Tag(tag=6) public Long chairId = null;
}
