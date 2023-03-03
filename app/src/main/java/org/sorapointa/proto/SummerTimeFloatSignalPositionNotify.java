package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class SummerTimeFloatSignalPositionNotify {
    @Tag(tag=1) public Vector position = null;
    @Tag(tag=5) public Boolean isTransferAnchor = null;
    @Tag(tag=7) public Integer floatSignalId = null;
}
