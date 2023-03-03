package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FishEscapeReason.*;
import org.sorapointa.proto.FishEscapeReason;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class FishEscapeNotify {
    @Tag(tag=4) public Integer reason = null;
    @Tag(tag=7) public Vector pos = null;
    @Tag(tag=14) public Integer uid = null;
    @Tag(tag=6) public List<Integer> fishIdList = new ArrayList<>();
}
