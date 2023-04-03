package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class FishInfo {
    @Tag(tag=1) public Integer fishId = null;
    @Tag(tag=2) public Integer fishPoolEntityId = null;
    @Tag(tag=3) public Vector fishPoolPos = null;
    @Tag(tag=4) public Integer fishPoolGadgetId = null;
    @Tag(tag=5) public Integer lastShockTime = null;
}
