package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CoopPoint.*;
import org.sorapointa.proto.CoopPoint;

public class CoopPointUpdateNotify {
    @Tag(tag=13) public CoopPoint coopPoint = null;
}
