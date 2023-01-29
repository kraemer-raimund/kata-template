import { sum } from "./sum";

describe("sum", () => {
  it("adds two numbers", () => {
    expect(sum(1, 2)).toBe(3);
  });

  it("handles negative numbers", () => {
    expect(sum(-1, -2)).toBe(-3);
  });

  it("handles decimal numbers", () => {
    expect(sum(0.1, 0.2)).toBeCloseTo(0.3);
  });
});
