package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class AddRandTaskInfoNotify {
    @Tag(tag=5) public Integer randTaskId = null;
    @Tag(tag=13) public Vector pos = null;
}
