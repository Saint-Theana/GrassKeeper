package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class SummerTimeFloatSignalUpdateNotify {
    @Tag(tag=4) public Boolean isTransferAnchor = null;
    @Tag(tag=8) public Integer floatSignalId = null;
    @Tag(tag=10) public Vector position = null;
}
